package com.tgenman.telegramtorss

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TelegramToRssApplication

fun main(args: Array<String>) {
	runApplication<TelegramToRssApplication>(*args)
}
