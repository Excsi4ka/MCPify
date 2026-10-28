package dev.excsi.mcpify.dto

data class PongResponse(
    val id: String,
    val serverTime: String,
    val type: String = "pong"
)
