package com.chaves.manageemployeeapi.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaleDTO {
    private Integer id;
    private LocalDate instant;
    private PersonDTO person;
    private Set<ItemDTO> itens = new HashSet<>();

    public SaleDTO(){}

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

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public Set<ItemDTO> getItens() {
        return itens;
    }

    public void setItens(Set<ItemDTO> itens) {
        this.itens = itens;
    }
}
