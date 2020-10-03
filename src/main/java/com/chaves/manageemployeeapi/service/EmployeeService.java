package com.chaves.manageemployeeapi.service;

import com.chaves.manageemployeeapi.dto.EmployeeDTO;
import com.chaves.manageemployeeapi.dto.PersonDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> findAll();
}
