package ru.onetable.onetablebook.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.onetable.onetablebook.entities.PhonebookEntity

@Repository //set of methods to implement standard JPA methods
interface PhonebookRepository : JpaRepository<PhonebookEntity, Int> { //Jpa inherits Crud
    fun findByName(name: String): PhonebookEntity?
}