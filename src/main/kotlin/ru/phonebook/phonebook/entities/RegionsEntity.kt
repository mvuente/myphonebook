package ru.phonebook.phonebook.entities

import javax.persistence.*

@Entity
@Table(name = "regions", schema = "public", catalog = "mvuente")
class RegionsEntity {
    @Id
    @Column(name = "id_region", nullable = false, insertable = false, updatable = false)
    val id_region: Int = 0

    @Basic
    @Column(name = "region", nullable = false)
    open var region: String? = null

    @OneToMany(mappedBy = "refRegionsEntity")
    open var refRegionsEntity: MutableList<NameEntity>? = null //if two tables are linked onetomany
}