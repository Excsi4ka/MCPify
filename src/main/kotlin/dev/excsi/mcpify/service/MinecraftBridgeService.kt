package dev.excsi.mcpify.service

import dev.excsi.mcpify.dto.PingRequest
import dev.excsi.mcpify.dto.PongResponse
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class MinecraftBridgeService {

    fun ping(request: PingRequest): PongResponse = PongResponse(
        id = request.id,
        serverTime = Instant.now().toString()
    )
}
