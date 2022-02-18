package com.gomsp.user_service.handler

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono
import javax.swing.text.Document
import com.gomsp.user_service.config.Code
import com.gomsp.user_service.domain.Response
import org.slf4j.LoggerFactory
import org.springframework.web.reactive.function.server.body

@Component
class MemberHandler {

    private val logger = LoggerFactory.getLogger(this::class.java)

    fun findAll(request: ServerRequest): Mono<ServerResponse> {
        try {
            return request.bodyToMono(Document::class.java)
                .flatMap {
                    ServerResponse.ok().body(Mono.just(Response(Code.OK_CODE, Code.OK_MESSAGE, it)))
                }
        } catch (e: Exception) {
            logger.error(e.message)
            return ServerResponse.ok()
                .body(Mono.just(Response(Code.INTERNAL_SERVER_ERROR_CODE, e.message.toString(), null)))
        }
    }

    fun findAllV11(request: ServerRequest): Mono<ServerResponse> {
        try {
            return request.bodyToMono(Document::class.java)
                .flatMap {
                    ServerResponse.ok().body(Mono.just(Response(Code.OK_CODE, Code.OK_MESSAGE, it)))
                }
        } catch (e: Exception) {
            logger.error(e.message)
            return ServerResponse.ok()
                .body(Mono.just(Response(Code.INTERNAL_SERVER_ERROR_CODE, e.message.toString(), null)))
        }
    }
    fun findOne(request: ServerRequest): Mono<ServerResponse> {
        try {
            return request.bodyToMono(Document::class.java)
                .flatMap { ServerResponse.ok().body(Mono.just(Response(Code.OK_CODE, Code.OK_MESSAGE, it))) }
        } catch (e: Exception) {
            logger.error(e.message)
            return ServerResponse.ok()
                .body(Mono.just(Response(Code.INTERNAL_SERVER_ERROR_CODE, e.message.toString(), null)))
        }
    }

    fun insertUser(request: ServerRequest): Mono<ServerResponse> {
        try {
            return request.bodyToMono(Document::class.java)
                .flatMap { ServerResponse.ok().body(Mono.just(Response(Code.OK_CODE, Code.OK_MESSAGE, it))) }
        } catch (e: Exception) {
            logger.error(e.message)
            return ServerResponse.ok()
                .body(Mono.just(Response(Code.INTERNAL_SERVER_ERROR_CODE, e.message.toString(), null)))
        }
    }

    fun insertUserV11(request: ServerRequest): Mono<ServerResponse> {
        try {
            return request.bodyToMono(Document::class.java)
                .flatMap { ServerResponse.ok().body(Mono.just(Response(Code.OK_CODE, Code.OK_MESSAGE, it))) }
        } catch (e: Exception) {
            logger.error(e.message)
            return ServerResponse.ok()
                .body(Mono.just(Response(Code.INTERNAL_SERVER_ERROR_CODE, e.message.toString(), null)))
        }
    }

    fun patchUser(request: ServerRequest): Mono<ServerResponse> {
        try {
            return request.bodyToMono(Document::class.java)
                .flatMap { ServerResponse.ok().body(Mono.just(Response(Code.OK_CODE, Code.OK_MESSAGE, it))) }
        } catch (e: Exception) {
            logger.error(e.message)
            return ServerResponse.ok()
                .body(Mono.just(Response(Code.INTERNAL_SERVER_ERROR_CODE, e.message.toString(), null)))
        }
    }

    fun deleteUser(request: ServerRequest): Mono<ServerResponse> {
        try {
            return request.bodyToMono(Document::class.java)
                .flatMap { ServerResponse.ok().body(Mono.just(Response(Code.OK_CODE, Code.OK_MESSAGE, it))) }
        } catch (e: Exception) {
            logger.error(e.message)
            return ServerResponse.ok()
                .body(Mono.just(Response(Code.INTERNAL_SERVER_ERROR_CODE, e.message.toString(), null)))
        }
    }
}