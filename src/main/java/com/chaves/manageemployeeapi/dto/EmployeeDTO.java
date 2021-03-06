package com.chaves.manageemployeeapi.dto;

import java.math.BigDecimal;

public class EmployeeDTO {

    private PersonDTO person;
    private String password;
    private Boolean active;
    private BigDecimal salary;

    public EmployeeDTO(){}

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
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

}
