package dev.excsi.mcpify.controller

import dev.excsi.mcpify.dto.PingRequest
import dev.excsi.mcpify.dto.PongResponse
import dev.excsi.mcpify.service.MinecraftBridgeService
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.simp.annotation.SendToUser
import org.springframework.stereotype.Controller

@Controller
class MinecraftBridgeController(

    val minecraftBridgeService: MinecraftBridgeService

) {

    @MessageMapping("/websocket/ping")
    @SendToUser(destinations = ["/queue/websocket/pong"], broadcast = false)
    fun ping(request: PingRequest): PongResponse = minecraftBridgeService.ping(request)
}
