package com.imageuploadapp.ImageUploadApp

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
class ImageUploadAppApplication

fun main(args: Array<String>) {
	runApplication<ImageUploadAppApplication>(*args)
}


