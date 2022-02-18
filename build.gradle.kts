import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar
import com.bmuschko.gradle.docker.tasks.image.*



apply(plugin = "com.bmuschko.docker-remote-api")
apply(plugin = "com.bmuschko.docker-spring-boot-application")


plugins {
    id("org.springframework.boot") version "2.6.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.spring") version "1.6.10"
    id("com.bmuschko.docker-remote-api") version "6.1.3"
    id("com.bmuschko.docker-spring-boot-application") version "6.1.3"
}

apply(from = "$rootDir/gradle/docker.gradle.kts")

group = "com.gomsp"
version = System.getenv("APP_VERSION") ?: "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11
var registry = System.getenv("APP_REGISTRY") ?: ""
if (registry.isNotEmpty()) registry += "/"

var springCloudVersion: String by extra
val springProfile: String by project
val dockerPluginVersion: String by extra
val gsonVersion: String by extra

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.apache.httpcomponents:httpclient:4.5.11")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

val createDockerfile by tasks.creating(Dockerfile::class) {
    destFile.set(project.file("./build/docker/Dockerfile"))
    var javaOpts = "-Xms1024m -Xmx2048m -XX:+UseG1GC -Dfile.encoding=UTF-8 -Djava.awt.headless=true -server -XX:MaxMetaspaceSize=256m -verbose:gc -XX:+UnlockExperimentalVMOptions -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/var/log/ "
    var execJar = "${project.name}-${version}.jar"
    var profiles = if(springProfile.isNullOrEmpty()) "default" else springProfile
    from("openjdk:11-slim")
    exposePort(8080)
    runCommand("apt-get update; apt-get install -y fontconfig libfreetype6")
    workingDir("/opt/${project.name}/libs/")
    runCommand("pwd")
    copyFile ("./build/libs/${execJar}", "/opt/${project.name}/libs/${execJar}")
    runCommand("touch /opt/${project.name}/libs/${execJar}")

    entryPoint ("sh", "-c", "java ${javaOpts} -Dspring.profiles.active=${profiles} -Djava.security.egd=file:/dev/./urandom -jar ${execJar}")
}

tasks.create("buildDockerImage", DockerBuildImage::class) {
    println("Start buildDockerImage...")
    dependsOn(createDockerfile)
    dockerFile.set(createDockerfile.destFile)
    println("Set created Dockerfile...")
    inputDir.set(project.projectDir)
    println("Set Input ProjectDir...${project.projectDir}")
    images.set(setOf("${registry}${project.name}:${version}","${registry}${project.name}:latest"))
}