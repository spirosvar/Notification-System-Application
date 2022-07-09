package com.notifapp.notifapp.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "preferences")
public class Preferences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "preferences_id")
    private int preferencesId;

    @Column(name = "mute_notifs", columnDefinition = "TINYINT")
    private boolean muteAll;

    @Column(name = "only_receive_clientapp_notifs", columnDefinition = "TINYINT")
    private boolean onlyClientAppNotif;

    @Column(name = "only_receive_person_notifs", columnDefinition = "TINYINT")
    private boolean onlyPersonNotif;

    @Column(name = "only_show_personal_notifs", columnDefinition = "TINYINT")
    private boolean onlyShowPersonal;

    @OneToOne(mappedBy = "preferences", cascade = CascadeType.ALL)
    private Person person;

    @Column(name = "def", columnDefinition = "TINYINT default 0")
    private boolean defaultPrefs;
    public Preferences() {}

    public Preferences(boolean muteAll, boolean onlyClientAppNotif, boolean onlyPersonNotif, boolean onlyShowPersonal, Person person) {
        this.muteAll = muteAll;
        this.onlyClientAppNotif = onlyClientAppNotif;
        this.onlyPersonNotif = onlyPersonNotif;
        this.onlyShowPersonal = onlyShowPersonal;
        this.person = person;
        this.defaultPrefs = true;
    }

    public int getPreferencesId() {
        return preferencesId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPreferencesId(int preferencesId) {
        this.preferencesId = preferencesId;
    }

    public boolean isMuteAll() {
        return muteAll;
    }

    public void setMuteAll(boolean muteAll) {
        this.muteAll = muteAll;
    }

    public boolean isOnlyClientAppNotif() {
        return onlyClientAppNotif;
    }

    public void setOnlyClientAppNotif(boolean onlyClientAppNotif) {
        this.onlyClientAppNotif = onlyClientAppNotif;
    }

    public boolean isOnlyPersonNotif() {
        return onlyPersonNotif;
    }

    public void setOnlyPersonNotif(boolean onlyPersonNotif) {
        this.onlyPersonNotif = onlyPersonNotif;
    }

    public boolean isOnlyShowPersonal() {
        return onlyShowPersonal;
    }

    public void setOnlyShowPersonal(boolean onlyShowPersonal) {
        this.onlyShowPersonal = onlyShowPersonal;
    }

    public boolean isDefaultPrefs() {
        return defaultPrefs;
    }

    public void setDefaultPrefs(boolean defaultPrefs) {
        this.defaultPrefs = defaultPrefs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preferences that = (Preferences) o;
        return getPreferencesId() == that.getPreferencesId() && isMuteAll() == that.isMuteAll() && isOnlyClientAppNotif() == that.isOnlyClientAppNotif() && isOnlyPersonNotif() == that.isOnlyPersonNotif() && isOnlyShowPersonal() == that.isOnlyShowPersonal();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPreferencesId(), isMuteAll(), isOnlyClientAppNotif(), isOnlyPersonNotif(), isOnlyShowPersonal());
    }

    @Override
    public String toString() {
        return "Preferences{" +
                "preferencesId=" + preferencesId +
                ", muteAll=" + muteAll +
                ", onlyClientAppNotif=" + onlyClientAppNotif +
                ", onlyPersonNotif=" + onlyPersonNotif +
                ", onlyShowPersonal=" + onlyShowPersonal +
                '}';
    }
}
