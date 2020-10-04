package com.chaves.manageemployeeapi.service.impl;

import com.chaves.manageemployeeapi.dto.DismissAndReadjustSalaryEmployeeDTO;
import com.chaves.manageemployeeapi.dto.EmployeeDTO;
import com.chaves.manageemployeeapi.exception.BusinessException;
import com.chaves.manageemployeeapi.mapper.MapStruct;
import com.chaves.manageemployeeapi.model.entity.Employee;
import com.chaves.manageemployeeapi.repositories.EmployeeRepository;
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

    @Override
    public EmployeeDTO create(EmployeeDTO dto) {
        Employee entity = mapper.employeeToEntity(dto);
        entity = repository.save(entity);
        return mapper.employeeToDTO(entity);
    }

    @Override
    public EmployeeDTO dismissAndReadjustSalary(Integer id, DismissAndReadjustSalaryEmployeeDTO dto) {
        return repository.findById(id)
                .map(employee -> {
                    if (employee.getActive()){
                        employee.setActive(dto.getActive());
                        employee.setSalary(dto.getSalary());
                        Employee employeeUpdated = repository.save(employee);
                        return mapper.employeeToDTO(employeeUpdated);
                    }else {
                        throw new BusinessException("Funcionario já demitido");
                    }
                })
                .orElseThrow( () -> new BusinessException("Funcionario não encontrado"));
    }
}
