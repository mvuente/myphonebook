package ru.onetable.onetablebook.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import ru.onetable.onetablebook.entities.PhonebookEntity

@Repository
interface PhonebookRepository : JpaRepository<PhonebookEntity, Int> { //Jpa inherits Crud
//interface PhonebookRepository : CrudRepository<PhonebookEntity, Int> {
    fun findByName(name: String): PhonebookEntity?


    //fun delete(name: String)
    //fun addContact(request: SaveBookRequest)
    //fun editContact(name: String, request: SaveBookRequest)
}