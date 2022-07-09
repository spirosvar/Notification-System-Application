package com.notifapp.notifapp.repository;

import com.notifapp.notifapp.domain.Person;
import com.notifapp.notifapp.domain.Preferences;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PreferencesRepository extends CrudRepository<Preferences, Integer> {

    Optional<Preferences> findByPerson(Person person);
}
