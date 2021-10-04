package one.dio.dioapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.dio.dioapi.dto.request.PersonDTO;
import one.dio.dioapi.dto.response.MessageResponseDTO;
import one.dio.dioapi.entity.Person;
import one.dio.dioapi.exception.PersonCreated;
import one.dio.dioapi.exception.PersonDeleted;
import one.dio.dioapi.exception.PersonNotFoundException;
import one.dio.dioapi.exception.PersonUpdate;
import one.dio.dioapi.mapper.PersonMapper;
import one.dio.dioapi.repository.PersonRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void createPerson(Person person){
        personRepository.save(person);
    }

    public List<Person> listAll() {
        return personRepository.findAll();
    }

    public Person findById(Long id) throws PersonNotFoundException{
        Optional <Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isEmpty()){
            throw new PersonNotFoundException(id);
        }
        Person p = optionalPerson.get();
        return p;
    }

    
    public void deleteById(Long id) throws PersonNotFoundException,PersonDeleted{
        Optional <Person> optionalPerson = personRepository.findById(id);

        if(optionalPerson.isEmpty()){
            throw new PersonNotFoundException(id);
        }
        else{
            personRepository.deleteById(id);
            throw new PersonDeleted(id);
        }

    }

    public void update(Long id, Person person) throws PersonNotFoundException,PersonUpdate{
        Optional <Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isEmpty()){
            throw new PersonNotFoundException(id);
        }else{
            personRepository.save(person);
            throw new PersonUpdate(id);
        }
    }




    
}
