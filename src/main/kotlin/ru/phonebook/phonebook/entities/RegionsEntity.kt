package ru.phonebook.phonebook.entities

import javax.persistence.*

@Entity
@Table(name = "regions", schema = "public", catalog = "mvuente")
data class RegionsEntity (
    @Id
    @Column(name = "id_region", nullable = false, insertable = false, updatable = false)
    val id_region: Int = 0,

//    @OneToMany(mappedBy = "refRegionsEntity")
//    open var refRegionsEntity: MutableList<NameEntity>? = null,

    @Basic
    @Column(name = "region", nullable = false)
    open var region: String? = null


)
{}