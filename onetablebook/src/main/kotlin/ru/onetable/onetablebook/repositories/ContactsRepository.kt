package ru.onetable.onetablebook.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.onetable.onetablebook.entities.ContactsEntity
import ru.onetable.onetablebook.entities.PhonebookEntity


@Repository
interface ContactsRepository : JpaRepository<ContactsEntity, Int> {

}