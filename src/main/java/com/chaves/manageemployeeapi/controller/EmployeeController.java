package com.chaves.manageemployeeapi.controller;

import com.chaves.manageemployeeapi.model.entity.Employee;
import com.chaves.manageemployeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> findAll(){
        return service.findAll();
    }
}
