package ru.onetable.onetablebook.entities

import javax.persistence.*

@Entity
@Table(name = "contacts")
class ContactsEntity( // no "data" class
    val phone: String,
    val email: String,

@ManyToOne
@JoinColumn(name = "name_id")
private val book: PhonebookEntity




): BaseEntity<Int>() {

//    fun copy(id: Int? = this.id, name: String = this.name,
//             region: String = this.region, city: String? = this.city,
//        //       phone: String = this.phone, email: String = this.email,
//             comments: String? = this.comments) =
//        PhonebookEntity(name, region, city, comments) // since this is no "data" class
}