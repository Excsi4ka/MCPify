package dev.excsi.mcpify

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class McpifyApplication

fun main(args: Array<String>) {
	runApplication<McpifyApplication>(*args)
}
