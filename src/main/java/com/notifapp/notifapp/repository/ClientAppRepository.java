package com.notifapp.notifapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.notifapp.notifapp.domain.ClientApp;

import java.util.List;

@Repository
public interface ClientAppRepository extends CrudRepository<ClientApp, Integer> {
    //this repo created just for testing reasons!
}
