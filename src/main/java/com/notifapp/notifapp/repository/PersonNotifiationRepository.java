package com.notifapp.notifapp.repository;

import com.notifapp.notifapp.domain.Notification;
import com.notifapp.notifapp.domain.Person;
import com.notifapp.notifapp.domain.PersonNotification;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PersonNotifiationRepository extends CrudRepository<PersonNotification, Integer> {



    Iterable<PersonNotification> findByPerson(Person person);

    Iterable<PersonNotification> findByNotification(Notification notification);

    Iterable<PersonNotification> findBySenderId(int senderId);

    Iterable<PersonNotification> findBySentAt(LocalDateTime sentAt);








}
