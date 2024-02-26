package com.alexleko.bebeer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BebeerApplication

fun main(args: Array<String>) {
	runApplication<BebeerApplication>(*args)
}
