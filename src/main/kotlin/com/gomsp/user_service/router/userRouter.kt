package com.gomsp.user_service.router

import com.gomsp.user_service.handler.MemberHandler
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router
import java.net.URI

@Component
class UserRouter {

    @Bean
    fun swaggerRouterV1() = router {
        accept(MediaType.TEXT_HTML).nest {
            GET("/") { permanentRedirect(URI("index.html")).build() }
        }
        resources("/**", ClassPathResource("/static"))
    }

    @Bean
    fun memberRouterV1(memberHandler: MemberHandler) = router {
        accept(MediaType.APPLICATION_JSON).nest {
            "/v1".nest {
                GET("/members", memberHandler::findAll)
                POST("/members", memberHandler::insertUser)
                GET("/members/{userUuid}", memberHandler::findOne)
                PATCH("/members/{userUuid}", memberHandler::patchUser)
                DELETE("/members/{userUuid}", memberHandler::deleteUser)
            }
        }
    }
}
