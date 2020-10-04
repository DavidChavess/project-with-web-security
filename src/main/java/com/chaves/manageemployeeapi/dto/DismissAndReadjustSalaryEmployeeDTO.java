package com.chaves.manageemployeeapi.dto;

import java.math.BigDecimal;

public class DismissAndReadjustSalaryEmployeeDTO {
    private Boolean active;
    private BigDecimal salary;

    public DismissAndReadjustSalaryEmployeeDTO(){}

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
