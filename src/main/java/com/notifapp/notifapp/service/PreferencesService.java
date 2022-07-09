package com.notifapp.notifapp.service;

import com.notifapp.notifapp.domain.Person;
import com.notifapp.notifapp.domain.Preferences;
import com.notifapp.notifapp.repository.PreferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PreferencesService {

    @Autowired
    PreferencesRepository preferencesRepository;

    public void savePreferences(Preferences p){
        preferencesRepository.save(p);
    }

    public Optional<Preferences> getPreferencesByPerson(Person person){
        return preferencesRepository.findByPerson(person);
    }

    public void updatePreferences(Preferences preferences){
        Optional<Preferences> temp = preferencesRepository.findByPerson(preferences.getPerson());
        if (temp.isPresent()){
            preferencesRepository.save(preferences);
        }
    }

    public void changeDefaultPreferences(Preferences pref) {
        Optional<Preferences> temp = preferencesRepository.findByPerson(pref.getPerson());
        if( (!temp.isEmpty()) && temp.get().isDefaultPrefs()){
            this.updatePreferences(pref);
        }
    }


}
