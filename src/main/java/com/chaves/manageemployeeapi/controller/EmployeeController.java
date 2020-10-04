package com.chaves.manageemployeeapi.controller;

import com.chaves.manageemployeeapi.dto.DismissAndReadjustSalaryEmployeeDTO;
import com.chaves.manageemployeeapi.dto.EmployeeDTO;
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
    public List<EmployeeDTO> findAll(){
        return service.findAll();
    }

    @PostMapping
    public EmployeeDTO create(@RequestBody EmployeeDTO dto){
        return service.create(dto);
    }

    @PatchMapping( value = "/{id}")
    public EmployeeDTO dismissAndReadjustSalary(@PathVariable Integer id, @RequestBody DismissAndReadjustSalaryEmployeeDTO dto){
        return service.dismissAndReadjustSalary(id, dto);
    }
}
