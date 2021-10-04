package one.dio.dioapi.Controller;

import lombok.AllArgsConstructor;
import one.dio.dioapi.dto.request.PersonDTO;
import one.dio.dioapi.dto.response.MessageResponseDTO;
import one.dio.dioapi.entity.Person;
import one.dio.dioapi.exception.PersonCreated;
import one.dio.dioapi.exception.PersonDeleted;
import one.dio.dioapi.exception.PersonNotFoundException;
import one.dio.dioapi.exception.PersonUpdate;
import one.dio.dioapi.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Person person){
        personService.createPerson(person);
    }

    @GetMapping
    public List<Person> listAll() {
        return personService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable Long id, @RequestBody Person person) throws PersonNotFoundException,PersonUpdate {
        personService.update(id, person);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws PersonNotFoundException,PersonDeleted{
        personService.deleteById(id);
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void findById(@PathVariable Long id) throws PersonNotFoundException {
        personService.findById(id);
    }
}
