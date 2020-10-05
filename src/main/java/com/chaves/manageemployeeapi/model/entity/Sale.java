package com.chaves.manageemployeeapi.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "INSTANT")
    private LocalDate instant;

    @JoinColumn(name = "PERSON_ID")
    @ManyToOne
    private Person person;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private Set<Item> itens = new HashSet<>();

    public Sale(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getInstant() {
        return instant;
    }

    public void setInstant(LocalDate instant) {
        this.instant = instant;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Item> getItens() {
        return itens;
    }
}
