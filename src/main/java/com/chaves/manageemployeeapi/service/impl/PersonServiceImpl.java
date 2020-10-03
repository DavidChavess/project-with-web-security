package com.chaves.manageemployeeapi.service.impl;

import com.chaves.manageemployeeapi.dto.PersonDTO;
import com.chaves.manageemployeeapi.mapper.MapStruct;
import com.chaves.manageemployeeapi.repositories.PersonRepository;
import com.chaves.manageemployeeapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private MapStruct mapper;

    @Autowired
    private PersonRepository repository;

    @Override
    public PersonDTO create(PersonDTO dto) {
        return mapper.personToDTO( repository.save( mapper.personToEntity(dto) ));
    }
}
