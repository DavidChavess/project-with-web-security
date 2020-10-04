package com.chaves.manageemployeeapi.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Employee {

    @Id
    private Integer id;

    @JoinColumn( name = "PERSON_ID")
    @OneToOne( cascade = CascadeType.ALL )
    @MapsId
    private Person person;

    @Column( name = "PASSWORD")
    private String password;

    @Column( name = "ACTIVE")
    private Boolean active;

    @Column( name = "SALARY")
    private BigDecimal salary;

    public Employee(){}

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
