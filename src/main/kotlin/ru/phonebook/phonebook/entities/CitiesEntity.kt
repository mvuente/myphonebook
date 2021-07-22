package ru.phonebook.phonebook.entities

import javax.persistence.*

@Entity
@Table(name = "cities", schema = "public", catalog = "mvuente")
data class CitiesEntity(
    @Id
    @Column(name = "id_city", nullable = false, insertable = false, updatable = false)
    val id_city: Int = 0,

    @Column(name = "city", nullable = false)
    open var city: String? = null,

//    @OneToMany(mappedBy = "refCitiesEntity")
//    open var refCitiesEntity: MutableList<NameEntity>? = null
) {}