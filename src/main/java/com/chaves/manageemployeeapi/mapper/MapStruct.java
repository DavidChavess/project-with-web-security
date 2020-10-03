package com.chaves.manageemployeeapi.mapper;

import com.chaves.manageemployeeapi.dto.EmployeeDTO;
import com.chaves.manageemployeeapi.dto.PersonDTO;
import com.chaves.manageemployeeapi.model.entity.Employee;
import com.chaves.manageemployeeapi.model.entity.Person;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface MapStruct {
    PersonDTO personToDTO (Person p);
    Person personToEntity (PersonDTO dto);
    EmployeeDTO employeeToDTO (Employee e);
}
