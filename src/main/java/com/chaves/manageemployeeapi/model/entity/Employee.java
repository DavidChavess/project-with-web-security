package com.chaves.manageemployeeapi.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "ID")
    private Integer id;

    @Column( name = "PASSWORD")
    private String password;

    @Column( name = "ACTIVE")
    private Boolean active;

    @Column( name = "SALARY")
    private BigDecimal salary;

    @JoinColumn( name = "PERSON_ID")
    @ManyToOne( cascade = CascadeType.ALL )
    private Person person;

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
