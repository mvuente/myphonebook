package ru.onetable.onetablebook.services.implementations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.onetable.onetablebook.entities.ContactsEntity
import ru.onetable.onetablebook.entities.PhonebookEntity
import ru.onetable.onetablebook.entities.SaveBookRequest
import ru.onetable.onetablebook.entities.SaveContactRequest
import ru.onetable.onetablebook.repositories.PhonebookRepository
import ru.onetable.onetablebook.repositories.ContactsRepository
import ru.onetable.onetablebook.services.PhonebookService
import java.util.Comparator

@Service
class PhonebookServiceImpl(private val phonebookRepository: PhonebookRepository,
       private val contactsRepository: ContactsRepository) : PhonebookService {

    override fun findAll(): List<PhonebookEntity> {
        val result = phonebookRepository.findAll()

        val sorted = result.sortedWith(compareBy<PhonebookEntity,String?>(nullsLast(), { it.city }))
        val byRegion = sorted.sortedWith(compareBy<PhonebookEntity> {it.region})
        return byRegion
    }

    override fun findByName(name: String): PhonebookEntity? {
        return phonebookRepository.findByName(name)
    }

    override fun delete(name: String) {
        val booktodelete = phonebookRepository.findByName(name)
        if (booktodelete != null) { // replace for exception
            phonebookRepository.delete(booktodelete)
        }
    }

    override fun addContact(request: SaveBookRequest) {
        phonebookRepository.saveAndFlush(
            PhonebookEntity(
                name = request.name!!,
                region = request.region!!,
                city = request.city,
                comments = request.comments
            )
        )
        contactsRepository.saveAndFlush(
            ContactsEntity(
                phone = request.phone!!,
                email = request.email!!,
                book = findByName(request.name)!!
            )
        )
    }

    override fun editContact(name: String, request: SaveBookRequest) {
        println(name)

        val book = phonebookRepository.findByName(name)
        println(book)
        if (book != null) { // replace for exception
            book.region = request.region!!
            book.city = request.city
            // book.phone = request.phone!!
            // book.email = request.email!!
            book.comments = request.comments
            phonebookRepository.saveAndFlush(book)
        }
            val phonefound = contactsRepository.findByPhone(request.phone!!)
            val emailfound = contactsRepository.findByEmail(request.email!!)
            if (phonefound == null && emailfound == null)
            {
                contactsRepository.saveAndFlush(
                    ContactsEntity(
                        phone = request.phone!!,
                        email = request.email!!,
                        book = findByName(name)!!
                    )
                )
            }
            else if (phonefound == null && emailfound != null)
            {
                emailfound.phone = request.phone!!
                contactsRepository.saveAndFlush(emailfound)
            }
            else if (emailfound == null && phonefound != null)
            {
                phonefound.email = request.email!!
                contactsRepository.saveAndFlush(phonefound)
            }

    }


}