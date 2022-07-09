package com.notifapp.notifapp.domain;

import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
@Entity(name = "notification")
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notification_id")
    private Integer notificationId;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

    @Column(name = "distribution_channel")
    @Enumerated(EnumType.STRING)
    private DistributionChannel distributionChannel;


   @OneToMany(mappedBy = "notification")
    private Set<PersonNotification> recipients;

   @ManyToOne
   @JoinColumn(name = "clientapp_sender")
   private ClientApp clientAppSender;

    @ManyToOne
    @JoinColumn(name = "person_sender")
    private Person personSender;






    public Notification(){}

    public Notification(String subject, String content, DistributionChannel distributionChannel,
                        Set<PersonNotification> recipients, Person person, ClientApp clientApp) {
        this.subject = subject;
        this.content = content;
        this.distributionChannel = distributionChannel;
        this.recipients = recipients;
        this.clientAppSender = clientApp;
        this.personSender = person;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DistributionChannel getDistributionChannel() {
        return distributionChannel;
    }

    public void setDistributionChannel(DistributionChannel distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public Set<PersonNotification> getRecipients() {
        return recipients;
    }

    public void setRecipients(Set<PersonNotification> recipients) {
        this.recipients = recipients;
    }

    public ClientApp getClientAppSender() {
        return clientAppSender;
    }

    public void setClientAppSender(ClientApp clientAppSender) {
        this.clientAppSender = clientAppSender;
    }

    public Person getPersonSender() {
        return personSender;
    }

    public void setPersonSender(Person personSender) {
        this.personSender = personSender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(getNotificationId(), that.getNotificationId()) && Objects.equals(getSubject(), that.getSubject()) && Objects.equals(getContent(),
                that.getContent()) && getDistributionChannel() == that.getDistributionChannel() && Objects.equals(getRecipients(),
                that.getRecipients()) && Objects.equals(getClientAppSender(), that.getClientAppSender()) && Objects.equals(getPersonSender(), that.getPersonSender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNotificationId(), getSubject(), getContent(), getDistributionChannel(), getRecipients());
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", distributionChannel=" + distributionChannel +
                ", recipients=" + recipients +
                ", clientAppSender=" + clientAppSender +
                ", personSender=" + personSender +
                '}';
    }
}




