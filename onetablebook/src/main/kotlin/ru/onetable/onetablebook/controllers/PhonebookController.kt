package ru.onetable.onetablebook.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.onetable.onetablebook.entities.SaveBookRequest
import ru.onetable.onetablebook.services.PhonebookService

@RestController
@RequestMapping(value = ["/contacts"])
class PhonebookController(private val phonebookService: PhonebookService) {
    @GetMapping
    fun findAll() = phonebookService.findAll()
    @GetMapping("/{name}")
    fun allbook(@PathVariable name: String): ResponseEntity<Any> {
        val book = phonebookService.findByName(name)
        return if (book != null)
            ResponseEntity.ok(book)
        else
            ResponseEntity.notFound().build()
    }
    @PostMapping
    fun create(@RequestBody request: SaveBookRequest) {
        phonebookService.addContact(request)
        // return StatusResponse("Created")
    }
    @PutMapping("/{name}")
    fun update(@PathVariable name: String, @RequestBody request: SaveBookRequest) {
        phonebookService.editContact(name, request)
    }
    @DeleteMapping("/{name}")
    fun delete(@PathVariable name: String) {
        phonebookService.delete(name)
    }
}