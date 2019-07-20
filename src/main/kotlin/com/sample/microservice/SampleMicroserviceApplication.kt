package com.sample.microservice

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleMicroserviceApplication

fun main(args: Array<String>) {
    runApplication<SampleMicroserviceApplication>(*args) {
        this.setBannerMode(Banner.Mode.OFF)
    }
}
