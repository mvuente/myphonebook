package ru.phonebook.phonebook.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.phonebook.phonebook.entities.NameEntity

@Repository
interface NameRepository : JpaRepository<NameEntity, Int> {
    fun findByName(name: String): NameEntity?

}