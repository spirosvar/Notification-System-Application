package com.notifapp.notifapp.service;

import com.notifapp.notifapp.domain.Notification;
import com.notifapp.notifapp.domain.Person;
import com.notifapp.notifapp.domain.PersonNotification;
import com.notifapp.notifapp.repository.PersonNotifiationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonNotificationService {


    @Autowired
    PersonNotifiationRepository personNotifiationRepository;

    public Iterable<PersonNotification> getAllPersonNotifications(Person person){

        return personNotifiationRepository.findByPerson(person);
    }

    public Iterable<PersonNotification> getAllNotificationRecipients(Notification notification){
        return personNotifiationRepository.findByNotification(notification);
    }

    public void createPersonNotification(PersonNotification personNotification){
        personNotifiationRepository.save(personNotification);
    }

    public void sendNotification(Notification notification, Person person, int senderId){
        PersonNotification pn = new PersonNotification();
        pn.setNotification(notification);
        pn.setSenderId(senderId);
        pn.setPerson(person);
        personNotifiationRepository.save(pn);
    }


}
