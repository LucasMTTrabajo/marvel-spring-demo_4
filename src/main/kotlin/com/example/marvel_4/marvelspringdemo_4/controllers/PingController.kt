package com.example.marvel_4.marvelspringdemo_4.controllers

import com.example.marvel_4.marvelspringdemo_4.model.BodyPingModel
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {
    @GetMapping("/ping")
    fun ping(): String {
        return "Pong!"
    }

    @PostMapping(value = ["/ping"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun pingWithBody(@RequestBody requestBody: BodyPingModel): ResponseEntity<BodyPingModel> {
        println("Hello World!")
        println(requestBody.id)
        return ResponseEntity.ok(BodyPingModel(null, requestBody.id))
    }
}