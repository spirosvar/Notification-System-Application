package com.notifapp.notifapp.controllers;


import com.notifapp.notifapp.domain.Person;
import com.notifapp.notifapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "person/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Person>> getPersonById(@PathVariable(value = "id") int id){
        return ResponseEntity.ok(personService.getPersonById(id));
    }
}
