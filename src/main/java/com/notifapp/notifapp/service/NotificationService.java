package com.notifapp.notifapp.service;



import java.util.List;

import com.notifapp.notifapp.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifapp.notifapp.domain.Notification;
import com.notifapp.notifapp.repository.NotificationRepository;

@Service
public class NotificationService {
    
    private List<Notification> list;
    @Autowired
    private NotificationRepository notificationRepository;

    public void createNotification(Notification notification){
        notificationRepository.save(notification);
    }

    public void deleteNotification(int id){
        notificationRepository.deleteById(id);
    }

    public Notification getNotificationById(int id){
        return notificationRepository.findById(id).get();
    }

    public Iterable<Notification> getNotificationAll(){
        return notificationRepository.findAll();
    }

    public Iterable<Notification> getNotificationsSentByPerson(Person p){
        return notificationRepository.findByPersonSender(p);
    }


}
