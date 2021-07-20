package ru.phonebook.phonebook.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/hello/"])
class PhbController {
    @GetMapping("hi")
    fun hello(): ResponseEntity<Any> {
        return ResponseEntity.ok("HI!")
    }
}