package ru.onetable.onetablebook.entities

import javax.persistence.*

@Entity
@Table(name = "contacts")
class ContactsEntity( // no "data" class
    var phone: String,
    var email: String,

    @ManyToOne
@JoinColumn(name = "name_id")
private val book: PhonebookEntity

): BaseEntity<Int>() {}
