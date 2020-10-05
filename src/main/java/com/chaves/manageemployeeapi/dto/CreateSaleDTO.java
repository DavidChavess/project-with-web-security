package com.chaves.manageemployeeapi.dto;
import java.util.HashSet;
import java.util.Set;

public class CreateSaleDTO {
    private Integer personId;
    private Set<ItemDTO> itens = new HashSet<>();

    public CreateSaleDTO(){}

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Set<ItemDTO> getItens() {
        return itens;
    }

    public void setItens(Set<ItemDTO> itens) {
        this.itens = itens;
    }
}
