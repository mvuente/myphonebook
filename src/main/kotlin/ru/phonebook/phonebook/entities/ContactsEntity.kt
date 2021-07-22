package ru.phonebook.phonebook.entities

import javax.persistence.*

@Entity
@Table(name = "contacts", schema = "public", catalog = "mvuente")
data class ContactsEntity (
    @Id
    @Column(name = "id_contact", nullable = false, insertable = false, updatable = false)
    val id_contact: Int = 0,

    @Basic
    @Column(name = "phone", nullable = false)
    open var phone: String? = null,

    @Basic
    @Column(name = "email", nullable = false)
    open var email: String? = null,

//    @Basic
//    @Column(name = "id_name", nullable = false, insertable = false, updatable = false)
//    open var id_name: Int? = null,

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_name", referencedColumnName = "id_name")
//    open var refNameEntity: NameEntity? = null

    @ManyToOne
    @JoinColumn(name = "id_name")
    private val name: NameEntity? = null

)
{}