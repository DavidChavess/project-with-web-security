package com.chaves.manageemployeeapi.repositories;

import com.chaves.manageemployeeapi.model.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
