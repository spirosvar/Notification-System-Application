package com.notifapp.notifapp.repository;

import com.notifapp.notifapp.domain.ClientApp;
import lombok.NonNull;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.notifapp.notifapp.domain.Person;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    Iterable<Person> findByClientAppUser(ClientApp clientAppUser);


}

