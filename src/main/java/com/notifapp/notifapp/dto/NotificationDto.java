package com.notifapp.notifapp.dto;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.notifapp.notifapp.domain.ClientApp;
import com.notifapp.notifapp.domain.DistributionChannel;
import com.notifapp.notifapp.domain.PersonNotification;

import lombok.Data;

public class NotificationDto {
    
    private Integer notificationId;
    private String subject;
    private String content;
    private DistributionChannel distributionChannel;
    private Set<PersonNotification> recipient;

    private ClientApp personSender;

    private ClientApp clientAppSender;


    public NotificationDto() {}

    public NotificationDto(Integer notificationId, String subject, String content, DistributionChannel distributionChannel,
                           Set<PersonNotification> recipient, ClientApp personSender, ClientApp clientAppSender) {
        this.notificationId = notificationId;
        this.subject = subject;
        this.content = content;
        this.distributionChannel = distributionChannel;
        this.recipient = recipient;
        this.personSender = personSender;
        this.clientAppSender = clientAppSender;
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

    public Set<PersonNotification> getRecipient() {
        return recipient;
    }

    public void setRecipient(Set<PersonNotification> recipient) {
        this.recipient = recipient;
    }



    public ClientApp getPersonSender() {
        return personSender;
    }

    public void setPersonSender(ClientApp personSender) {
        this.personSender = personSender;
    }

    public ClientApp getClientAppSender() {
        return clientAppSender;
    }

    public void setClientAppSender(ClientApp clientAppSender) {
        this.clientAppSender = clientAppSender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationDto that = (NotificationDto) o;
        return Objects.equals(getNotificationId(), that.getNotificationId()) && Objects.equals(getSubject(), that.getSubject()) && Objects.equals(getContent(), that.getContent()) && getDistributionChannel() == that.getDistributionChannel() && Objects.equals(getRecipient(), that.getRecipient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNotificationId(), getSubject(), getContent(), getDistributionChannel(), getRecipient());
    }

    @Override
    public String toString() {
        return "NotificationDto{" +
                "notificationId=" + notificationId +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", distributionChannel=" + distributionChannel +
                ", recipient=" + recipient +
                '}';
    }
}
