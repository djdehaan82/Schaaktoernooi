package com.capgemini.Schaaktoernooi.Api;

import com.capgemini.Schaaktoernooi.controller.Schaakrepository
import com.capgemini.Schaaktoernooi.model.Schaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class SchakerEndpoint
{@Autowired
private Schaakrepository mijnSchaakrepository;

    @GetMapping ("toevoegen")
    public Iterable<Schaker> toevoegen) {
        return mijnSchaakrepository.findAll();
    }


    @PostMapping("toevoegen")
    public String toevoegen (@RequestBody Schaker schaker) {
    mijnSchaakrepository.save(schaker);
    return "deelnemer opgeslagen"; }
}

