package com.chaves.manageemployeeapi.service.impl;

import com.chaves.manageemployeeapi.dto.EmployeeDTO;
import com.chaves.manageemployeeapi.dto.PersonDTO;
import com.chaves.manageemployeeapi.mapper.MapStruct;
import com.chaves.manageemployeeapi.repositories.EmployeeRepository;
import com.chaves.manageemployeeapi.repositories.PersonRepository;
import com.chaves.manageemployeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private MapStruct mapper;

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<EmployeeDTO> findAll() {
        return repository.findAll().stream().map(mapper::employeeToDTO).collect(Collectors.toList());
    }
}
