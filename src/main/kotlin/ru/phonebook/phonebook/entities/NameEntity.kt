package ru.phonebook.phonebook.entities

import javax.persistence.*

@Entity
@Table(name = "name", schema = "public", catalog = "mvuente")
open class NameEntity {     // class data or open?
    @Id
    @Column(name = "id_name", nullable = false, insertable = false, updatable = false)
    val id_name: Int = 0

    @Basic
    @Column(name = "name", nullable = false)
    open var name: String? = null

    @Basic
    @Column(name = "region", nullable = false)
    open var region: String? = null
}