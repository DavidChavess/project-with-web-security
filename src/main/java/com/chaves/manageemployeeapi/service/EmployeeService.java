package com.chaves.manageemployeeapi.service;

import com.chaves.manageemployeeapi.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
