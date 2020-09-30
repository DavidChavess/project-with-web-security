package com.chaves.manageemployeeapi.service.impl;

import com.chaves.manageemployeeapi.model.entity.Employee;
import com.chaves.manageemployeeapi.repositories.EmployeeRepository;
import com.chaves.manageemployeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }
}
