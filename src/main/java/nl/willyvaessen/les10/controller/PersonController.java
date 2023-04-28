package nl.willyvaessen.les10.controller;

import nl.willyvaessen.les10.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private List<Person> persons = new ArrayList<>();

    public PersonController() {
        Person p = new Person();
        p.name = "Pietje";
        p.dob = LocalDate.of(1995, Month.AUGUST, 8); // Dates are in YYYY-MM-DD format
        p.gender = 'm';
        this.persons.add(p);
    }
    @GetMapping
    public ResponseEntity<List<Person>> getPersons() {
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person p) {
        persons.add(p);
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person p, @PathVariable int id) {
        if (id >= 0 && id < persons.size()) {
        persons.set(id, p);
        return new ResponseEntity<>(p, HttpStatus.OK);
        }
        else {
            //  Error situation
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
