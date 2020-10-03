package com.chaves.manageemployeeapi.controller;

import com.chaves.manageemployeeapi.dto.EmployeeDTO;
import com.chaves.manageemployeeapi.dto.PersonDTO;
import com.chaves.manageemployeeapi.service.EmployeeService;
import com.chaves.manageemployeeapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<EmployeeDTO> findAll(){
        return service.findAll();
    }
}
