package ru.onetable.onetablebook.services

import ru.onetable.onetablebook.entities.PhonebookEntity
import ru.onetable.onetablebook.entities.SaveBookRequest

interface PhonebookService { // methods to be used in he application business logic
    fun findAll(): List<PhonebookEntity>?
    fun findByName(name: String): PhonebookEntity? //  method from JpaRepository
    fun delete(name: String)
    fun addContact(request: SaveBookRequest)
    fun editContact(name: String, request: SaveBookRequest)

}
