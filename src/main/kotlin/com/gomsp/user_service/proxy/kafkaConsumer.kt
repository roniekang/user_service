package com.gomsp.user_service.proxy
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KotlinConsumer {
    private val logger = LoggerFactory.getLogger(javaClass)
    @KafkaListener(topics = ["obj-topic"], groupId = "ronie")
    fun processMessage(message: String) {
        logger.info("got message: {}", message)
    }
}