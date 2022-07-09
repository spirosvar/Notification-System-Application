package com.notifapp.notifapp.dto;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.notifapp.notifapp.domain.ClientApp;
import com.notifapp.notifapp.domain.Notification;
import com.notifapp.notifapp.domain.PersonNotification;

import com.notifapp.notifapp.domain.Preferences;
import lombok.Data;

@SuppressWarnings("all")
public class PersonDto {
    
    private Integer personId;
    private String email;
    Set<PersonNotification> personNotifications;
    private ClientApp clientAppUser;
    List<Notification> sentNotifications;
    private Preferences preferences;

    public PersonDto() {}

    public PersonDto(Integer personId, String email, Set<PersonNotification> personNotifications,
                     ClientApp clientAppUser, List<Notification> sentNotifications, Preferences preferences) {
        this.personId = personId;
        this.email = email;
        this.personNotifications = personNotifications;
        this.clientAppUser = clientAppUser;
        this.sentNotifications = sentNotifications;
        this.preferences = preferences;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<PersonNotification> getPersonNotifications() {
        return personNotifications;
    }

    public void setPersonNotifications(Set<PersonNotification> personNotifications) {
        this.personNotifications = personNotifications;
    }

    public ClientApp getClientAppUser() {
        return clientAppUser;
    }

    public void setClientAppUser(ClientApp clientAppUser) {
        this.clientAppUser = clientAppUser;
    }

    public List<Notification> getSentNotifications() {
        return sentNotifications;
    }

    public void setSentNotifications(List<Notification> sentNotifications) {
        this.sentNotifications = sentNotifications;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto personDto = (PersonDto) o;
        return Objects.equals(getPersonId(), personDto.getPersonId()) && Objects.equals(getEmail(), personDto.getEmail()) && Objects.equals(getPersonNotifications(), personDto.getPersonNotifications()) && Objects.equals(getClientAppUser(), personDto.getClientAppUser()) && Objects.equals(getSentNotifications(), personDto.getSentNotifications()) && Objects.equals(getPreferences(), personDto.getPreferences());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getEmail(), getPersonNotifications(), getClientAppUser(), getSentNotifications(), getPreferences());
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "personId=" + personId +
                ", email='" + email + '\'' +
                ", personNotifications=" + personNotifications +
                ", clientAppUser=" + clientAppUser +
                ", sentNotifications=" + sentNotifications +
                ", preferences=" + preferences +
                '}';
    }
}
