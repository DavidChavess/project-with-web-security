package com.chaves.manageemployeeapi.controller;

import com.chaves.manageemployeeapi.dto.PersonDTO;
import com.chaves.manageemployeeapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private PersonService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public PersonDTO create(@RequestBody PersonDTO person ){
        return service.create(person);
    }
}
