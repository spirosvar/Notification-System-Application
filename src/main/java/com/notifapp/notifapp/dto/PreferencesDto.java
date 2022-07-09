package com.notifapp.notifapp.dto;

import com.notifapp.notifapp.domain.Person;

import javax.persistence.*;
import java.util.Objects;

public class PreferencesDto {


    private int preferencesId;
    private boolean muteAll;
    private boolean onlyClientAppNotif;
    private boolean onlyPersonNotif;
    private boolean onlyShowPersonal;
    private Person person;
    private boolean defaultPrefs;

    public PreferencesDto(){}

    public PreferencesDto(int preferencesId, boolean muteAll, boolean onlyClientAppNotif, boolean onlyPersonNotif, boolean onlyShowPersonal, Person person, boolean defaultPrefs) {
        this.preferencesId = preferencesId;
        this.muteAll = muteAll;
        this.onlyClientAppNotif = onlyClientAppNotif;
        this.onlyPersonNotif = onlyPersonNotif;
        this.onlyShowPersonal = onlyShowPersonal;
        this.person = person;
        this.defaultPrefs = defaultPrefs;
    }

    public int getPreferencesId() {
        return preferencesId;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
        PreferencesDto that = (PreferencesDto) o;
        return getPreferencesId() == that.getPreferencesId() && isMuteAll() == that.isMuteAll() && isOnlyClientAppNotif() == that.isOnlyClientAppNotif() && isOnlyPersonNotif() == that.isOnlyPersonNotif() && isOnlyShowPersonal() == that.isOnlyShowPersonal() && isDefaultPrefs() == that.isDefaultPrefs() && Objects.equals(getPerson(), that.getPerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPreferencesId(), isMuteAll(), isOnlyClientAppNotif(), isOnlyPersonNotif(), isOnlyShowPersonal(), getPerson(), isDefaultPrefs());
    }

    @Override
    public String toString() {
        return "PreferencesDto{" +
                "preferencesId=" + preferencesId +
                ", muteAll=" + muteAll +
                ", onlyClientAppNotif=" + onlyClientAppNotif +
                ", onlyPersonNotif=" + onlyPersonNotif +
                ", onlyShowPersonal=" + onlyShowPersonal +
                ", person=" + person +
                ", defaultPrefs=" + defaultPrefs +
                '}';
    }
}
