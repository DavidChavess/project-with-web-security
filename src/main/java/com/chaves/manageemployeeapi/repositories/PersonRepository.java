package com.chaves.manageemployeeapi.repositories;

import com.chaves.manageemployeeapi.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
