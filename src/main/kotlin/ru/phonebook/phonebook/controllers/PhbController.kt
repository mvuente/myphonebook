package ru.phonebook.phonebook.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.phonebook.phonebook.services.NameService

@RestController
@RequestMapping(value = ["/hello/"])
class PhbController (private val nameService: NameService){
    @GetMapping("{name}")
    fun hello(@PathVariable name: String): ResponseEntity<Any> {
        val contact_name = nameService.findByName(name)
        return if (contact_name != null)
            ResponseEntity.ok(contact_name)
        else
            ResponseEntity.notFound().build()



    }
}