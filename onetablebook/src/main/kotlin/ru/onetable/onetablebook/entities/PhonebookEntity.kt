package ru.onetable.onetablebook.entities

import javax.persistence.*

@Entity
@Table(name = "book")
class PhonebookEntity( // no "data" class
    val name: String,
    var region: String,
    var city: String?,
    var comments: String?,
    @OneToMany(
        mappedBy = "book",
        fetch = FetchType.LAZY,
        orphanRemoval = true,
        cascade = [CascadeType.ALL]
    )
    val contacts: MutableList<ContactsEntity> = mutableListOf()

): BaseEntity<Int>() {}
