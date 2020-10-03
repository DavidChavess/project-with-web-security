package com.chaves.manageemployeeapi.dto;

import java.math.BigDecimal;

public class EmployeeDTO {

    private Integer id;
    private String password;
    private Boolean active;
    private BigDecimal salary;
    private PersonDTO person;

    public EmployeeDTO(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPersonDTO(PersonDTO personDTO) {
        this.person = personDTO;
    }
}
