package ru.onetable.onetablebook.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.onetable.onetablebook.entities.ContactsEntity
import ru.onetable.onetablebook.entities.PhonebookEntity

@Repository //set of methods to implement standard JPA methods
interface ContactsRepository : JpaRepository<ContactsEntity, Int> {
    fun findByPhone(phone: String): ContactsEntity?
    fun findByEmail(email: String): ContactsEntity?
}