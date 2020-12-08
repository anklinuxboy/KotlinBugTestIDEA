package com.example.kotlinbugtest

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.single
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinbugtestApplication

fun main(args: Array<String>) {
    // Throws an error 'unresolved reference' for me even though the import is added above
    val flow = Flow.single()
    runApplication<KotlinbugtestApplication>(*args)
}
