package com.chaves.manageemployeeapi.controller;

import com.chaves.manageemployeeapi.dto.CreateSaleDTO;
import com.chaves.manageemployeeapi.dto.PersonDTO;
import com.chaves.manageemployeeapi.dto.SaleDTO;
import com.chaves.manageemployeeapi.model.entity.Sale;
import com.chaves.manageemployeeapi.service.PersonService;
import com.chaves.manageemployeeapi.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public SaleDTO create(@RequestBody CreateSaleDTO dto){
        return service.create(dto);
    }

    @GetMapping
    public List<SaleDTO> findAll(){
        return service.findAll();
    }
}
