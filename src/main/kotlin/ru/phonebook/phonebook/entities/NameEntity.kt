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

    @Basic
    @Column(name = "id_region", nullable = false, insertable = false, updatable = false)
    open var id_region: Int? = null

    @Basic
    @Column(name = "id_city", insertable = false, updatable = false)
    open var id_city: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_region", referencedColumnName = "id_region")
    open var refRegionsEntity: RegionsEntity? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_city", referencedColumnName = "id_city")
    open var refCitiesEntity: CitiesEntity? = null

    @OneToMany(mappedBy = "refNameEntity")
    open var refNameEntity: MutableList<ContactsEntity>? = null

}