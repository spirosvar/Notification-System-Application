package com.notifapp.notifapp.service;

import java.util.List;
import java.util.Optional;

import com.notifapp.notifapp.domain.ClientApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifapp.notifapp.domain.Person;
import com.notifapp.notifapp.repository.PersonRepository;

@Service
public class PersonService{

    

    @Autowired
    private PersonRepository personRepository;

    public void save(Person person){
        personRepository.save(person);
    }

    public Optional<Person> getPersonById(int personId){
        return personRepository.findById(personId);
    }

    public Iterable<Person> getAllPersonUsers(){
        return personRepository.findAll();
    }

    public Iterable<Person> getAllUsersCreatedBy(ClientApp c){
        return personRepository.findByClientAppUser(c);
    }

    public long getTotalUsers(){
        return personRepository.count();
    }


}
