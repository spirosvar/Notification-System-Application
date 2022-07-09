package com.notifapp.notifapp.domain;

import javax.persistence.*;

import lombok.Data;
import lombok.NonNull;

import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "clientapp")
public class ClientApp {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clientapp_id")
    private Integer clientappId;

    @OneToMany(mappedBy = "clientAppUser")
    List<Person> personUsers;

    @OneToMany(mappedBy = "clientAppSender")
    List<Notification> notifications;



    public ClientApp(){}

    public ClientApp(Integer clientappId){
        this.clientappId = clientappId;
    }

    public Integer getClientappId() {
        return clientappId;
    }

    public void setClientappId(Integer clientappId) {
        this.clientappId = clientappId;
    }

    public List<Person> getPersonUsers() {
        return personUsers;
    }

    public void setPersonUsers(List<Person> personUsers) {
        this.personUsers = personUsers;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientApp clientApp = (ClientApp) o;
        return getClientappId().equals(clientApp.getClientappId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientappId());
    }

    @Override
    public String toString() {
        return "ClientApp{" +
                "clientappId=" + clientappId +
                '}';
    }
}
