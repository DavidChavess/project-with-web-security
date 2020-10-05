package com.chaves.manageemployeeapi.dto;

import java.math.BigDecimal;

public class ItemDTO {

    private Integer id;
    private String name;
    private BigDecimal value;

    public ItemDTO(){}

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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
