package com.notifapp.notifapp.domain;


import javax.persistence.*;
import javax.validation.constraints.Email;

import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private Integer personId;

    @Email
    @Column(name = "email")
    @NonNull
    private String email;


    @OneToOne
    @JoinColumn(name = "preference_id")
    @NonNull
    private Preferences preferences;

    @OneToMany(mappedBy = "person")
    @NonNull
    Set<PersonNotification> personNotifications;

    @ManyToOne
    @JoinColumn(name = "createdby")
    private ClientApp clientAppUser;

    @OneToMany(mappedBy = "personSender")
    List<Notification> sentNotifications;


    public Person() {}

    public Person(String email, Set<PersonNotification> personNotifications) {
        this.email = email;
        this.preferences = new Preferences(false, false, false, false, this);
        this.personNotifications = personNotifications;
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

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public Set<PersonNotification> getPersonNotifications() {
        return personNotifications;
    }

    public void setPersonNotifications(Set<PersonNotification> personNotifications) {
        this.personNotifications = personNotifications;
    }

    public List<Notification> getSentNotifications() {
        return sentNotifications;
    }

    public void setSentNotifications(List<Notification> sentNotifications) {
        this.sentNotifications = sentNotifications;
    }

    public ClientApp getClientAppUser() {
        return clientAppUser;
    }

    public void setClientAppUser(ClientApp clientAppUser) {
        this.clientAppUser = clientAppUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getPersonId().equals(person.getPersonId()) && getEmail().equals(person.getEmail()) && getPreferences().equals(person.getPreferences()) && Objects.equals(getPersonNotifications(), person.getPersonNotifications());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getEmail(), getPreferences(), getPersonNotifications());
    }


    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", email='" + email + '\'' +
                ", preferences=" + preferences +
                ", personNotifications=" + personNotifications +
                '}';
    }
}
    
    
    
    
    
    
    

    
    
    
    
    
    
    


