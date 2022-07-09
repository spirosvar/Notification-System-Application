package com.notifapp.notifapp.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.*;

import lombok.Data;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "person_notification")
public class PersonNotification {

    @Id
    @Column(name = "id")
    private int personNotifId;
    @NonNull
    @ManyToOne
    @JoinColumn(name = "person_id")
    Person person;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "notification_id")
    Notification notification;

    @NonNull
    @Column(name = "sent_at")
    private LocalDateTime sentAt;

    @NonNull
    @Column(name = "sender")
    private int senderId;
    
    
    
    @PrePersist
    void sendTime(){
        sentAt = LocalDateTime.now();
    }

    public PersonNotification() {}

    public PersonNotification(@NonNull Person person, @NonNull Notification notification,int senderId) {
        this.person = person;
        this.notification = notification;
        this.senderId = senderId;
    }

    public int getPersonNotifId() {
        return personNotifId;
    }

    @NonNull
    public Person getPerson() {
        return person;
    }

    public void setPerson(@NonNull Person person) {
        this.person = person;
    }

    @NonNull
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(@NonNull Notification notification) {
        this.notification = notification;
    }

    @NonNull
    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public void setPersonNotifId(int personNotifId) {
        this.personNotifId = personNotifId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonNotification that = (PersonNotification) o;
        return getPersonNotifId() == that.getPersonNotifId() && getSenderId() == that.getSenderId() && getPerson().equals(that.getPerson()) && getNotification().equals(that.getNotification()) && getSentAt().equals(that.getSentAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonNotifId(), getPerson(), getNotification(), getSentAt(), getSenderId());
    }

    @Override
    public String toString() {
        return "PersonNotification{" +
                "personNotifId=" + personNotifId +
                ", person=" + person +
                ", notification=" + notification +
                ", sentAt=" + sentAt +
                ", senderId=" + senderId +
                '}';
    }
}
