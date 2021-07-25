package ru.onetable.onetablebook.services

import org.springframework.data.jpa.repository.Query

import ru.onetable.onetablebook.entities.PhonebookEntity
import ru.onetable.onetablebook.entities.SaveBookRequest

interface PhonebookService {
    //@Query("select name from book group by region order by region", nativeQuery = true)
    fun findAll(): List<PhonebookEntity>?
    fun findByName(name: String): PhonebookEntity? //  method from JpaRepository
    fun delete(name: String)
    fun addContact(request: SaveBookRequest)
    fun editContact(name: String, request: SaveBookRequest)

}

//class SaveBookRequest (
//    val name: String?,
//    val region: String?,
//    val city: String?,
//    val phone: String?,
//    val email: String?,
//    val comments: String?
//        )