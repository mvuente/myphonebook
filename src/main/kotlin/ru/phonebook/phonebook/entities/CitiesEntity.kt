package ru.phonebook.phonebook.entities

import javax.persistence.*

@Entity
@Table(name = "cities", schema = "public", catalog = "mvuente")
class CitiesEntity {
    @Id
    @Column(name = "id_city", nullable = false, insertable = false, updatable = false)
    val id_city: Int = 0

    @Basic
    @Column(name = "city", nullable = false)
    open var city: String? = null

    @Basic
    @Column(name = "id_region", nullable = false, insertable = false, updatable = false)
    open var id_region: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_region", referencedColumnName = "id_region")
    open var refRegionsEntity: RegionsEntity? = null

    @OneToMany(mappedBy = "refCitiesEntity")
    open var refCitiesEntity: MutableList<NameEntity>? = null
}