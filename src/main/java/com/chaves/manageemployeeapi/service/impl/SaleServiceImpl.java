package com.chaves.manageemployeeapi.service.impl;

import com.chaves.manageemployeeapi.dto.CreateSaleDTO;
import com.chaves.manageemployeeapi.dto.SaleDTO;
import com.chaves.manageemployeeapi.mapper.MapStruct;
import com.chaves.manageemployeeapi.model.entity.Item;
import com.chaves.manageemployeeapi.model.entity.Sale;
import com.chaves.manageemployeeapi.repositories.PersonRepository;
import com.chaves.manageemployeeapi.repositories.SaleRepository;
import com.chaves.manageemployeeapi.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private MapStruct mapper;

    @Autowired
    private SaleRepository repository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<SaleDTO> findAll() {
        return repository.findAll().stream().map(mapper::saleToDTO).collect(Collectors.toList());
    }

    @Override
    public SaleDTO create(CreateSaleDTO dto) {
        Sale entity = new Sale();

        entity.setInstant(now());
        entity.setPerson( personRepository.getOne(dto.getPersonId()) );

        Set<Item> set = dto.getItens().stream().map(mapper::itemToEntity).collect(Collectors.toSet());
        entity.getItens().addAll(set);

        for (Item x : set){
            x.setSale(entity);
        }

        return mapper.saleToDTO(repository.save(entity));
    }


}
