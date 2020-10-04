package com.chaves.manageemployeeapi.service;

import com.chaves.manageemployeeapi.dto.DismissAndReadjustSalaryEmployeeDTO;
import com.chaves.manageemployeeapi.dto.EmployeeDTO;
import com.chaves.manageemployeeapi.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> findAll();
    EmployeeDTO create(EmployeeDTO dto);
    EmployeeDTO dismissAndReadjustSalary(Integer id, DismissAndReadjustSalaryEmployeeDTO dto);
}
