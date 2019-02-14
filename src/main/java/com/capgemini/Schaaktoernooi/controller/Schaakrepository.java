package com.capgemini.Schaaktoernooi.controller;

import com.capgemini.Schaaktoernooi.model.Schaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface Schaakrepository extends CrudRepository <Schaker, Long> {

}
