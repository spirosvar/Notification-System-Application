package com.notifapp.notifapp.repository;


import com.notifapp.notifapp.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.notifapp.notifapp.domain.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Integer> {
    Iterable<Notification> findByPersonSender(Person personSender);


}
