package com.chaves.manageemployeeapi.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "ID")
    private Integer id;

    @Column( name = "NAME")
    private String name;

    @Column( name = "DATE")
    private LocalDate date;

    @Column( name = "PHONE")
    private String phone;

    @Column( name = "ADDRESS")
    private String address;

    @Column( name = "EMAIL")
    private String email;

    @JsonIgnoreProperties(value = "person")
    @OneToOne(mappedBy = "person")
    private Employee employee;

    @JsonIgnoreProperties(value = "person")
    @OneToMany(mappedBy = "person")
    private Set<Sale> sales = new HashSet<>();

    public Person(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<Sale> getSales() {
        return sales;
    }

}
