package com.sample.microservice

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
@RestController
@RequestMapping(value =["hello"])
class SampleMicroserviceApplication {

    @GetMapping(value = ["/{firstName}/{lastName}"], produces = ["application/json"])
    fun hello(@PathVariable firstName: String, @PathVariable lastName: String): String {
        return "{\"message\":\"Hello $firstName $lastName\"}"
    }

    @GetMapping(value = ["/me"])
    fun sayMe(): String {
        return "Say Hi"
    }
}

fun main(args: Array<String>) {
    runApplication<SampleMicroserviceApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
