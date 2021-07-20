package ru.phonebook.phonebook.services

import ru.phonebook.phonebook.entities.NameEntity

interface NameService {
    fun findAll(): List<NameEntity>
    fun findByNameStartsWithAndRegion(name:String):NameEntity?
}