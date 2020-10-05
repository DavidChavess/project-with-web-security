package com.chaves.manageemployeeapi.mapper;

import com.chaves.manageemployeeapi.dto.*;
import com.chaves.manageemployeeapi.model.entity.Employee;
import com.chaves.manageemployeeapi.model.entity.Item;
import com.chaves.manageemployeeapi.model.entity.Person;
import com.chaves.manageemployeeapi.model.entity.Sale;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface MapStruct {
    PersonDTO personToDTO (Person p);
    Person personToEntity (PersonDTO dto);
    EmployeeDTO employeeToDTO (Employee e);
    Employee employeeToEntity(EmployeeDTO dto);

    Sale saleToEntity(SaleDTO dto);
    SaleDTO saleToDTO(Sale s);

    Item itemToEntity(ItemDTO itemDTO);
}
