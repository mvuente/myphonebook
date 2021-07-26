package ru.onetable.onetablebook.entities

import javax.persistence.*

@Entity
@Table(name = "book")
class PhonebookEntity( // no "data" class
    val name: String,
    var region: String,
    var city: String?,
   // var phone: String,
    //var email: String,
    var comments: String?,
    @OneToMany(
        mappedBy = "book",
        fetch = FetchType.LAZY,
        orphanRemoval = true,
        cascade = [CascadeType.ALL]
    )
    val contacts: MutableList<ContactsEntity> = mutableListOf()

): BaseEntity<Int>() {}

//    fun copy(id_name: Int? = this.id_name, name: String = this.name,
//             region: String = this.region, city: String? = this.city,
//      //       phone: String = this.phone, email: String = this.email,
//             comments: String? = this.comments) =
//        PhonebookEntity(name, region, city, comments) // since this is no "data" class
//}