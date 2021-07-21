package ru.phonebook.phonebook.entities

import javax.persistence.*

@Entity
@Table(name = "name", schema = "public", catalog = "mvuente")
open class NameEntity {
    @Id
    @Column(name = "id_name", nullable = false, insertable = false, updatable = false)
    val id_name: Int = 0

    @Basic
    @Column(name = "name", nullable = false)
    open var name: String? = null

}