package ru.phonebook.phonebook.services

import org.springframework.stereotype.Service
import ru.phonebook.phonebook.entities.NameEntity
import ru.phonebook.phonebook.repositories.NameRepository

@Service
class NameServiceImpl(private val nameRepository: NameRepository):NameService {
    override fun findAll(): List<NameEntity> {
        return nameRepository.findAll()
    }

    override fun findByNameStartsWithAndRegion(name:String): NameEntity? {
        return nameRepository.findByNameStartsWithAndRegion(name)
    }

}