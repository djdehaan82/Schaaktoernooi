package com.capgemini.Schaaktournooi.Api;

import com.capgemini.Schaaktournooi.controller.Schaakrepository;
import com.capgemini.Schaaktournooi.model.Schaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SchakerEndpoint {
    @Autowired
    private Schaakrepository mijnSchaakrepository;

    @GetMapping("nieuweSchaker/{Schaaknaam}")
    public Schaker nieuwSchakerMaken(@PathVariable String Schaaknaam){
        System.out.println("go"+Schaaknaam);
        Schaker deSchaker = new Schaker() ;
        deSchaker.achternaam= Schaaknaam;
        Schaker grootMeester = mijnSchaakrepository.save(deSchaker);


    @GetMapping ("geefalleschakers")
        public Iterable<Schaker> geefalleschakers()
    {return mijnSchaakrepository.findAll();}
}
