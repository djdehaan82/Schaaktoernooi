package com.capgemini.Schaaktournooi.controller;

import com.capgemini.Schaaktournooi.model.Schaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface Schaakrepository extends CrudRepository <Schaker, Long> {

}
