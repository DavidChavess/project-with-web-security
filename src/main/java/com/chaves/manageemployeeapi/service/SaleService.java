package com.chaves.manageemployeeapi.service;

import com.chaves.manageemployeeapi.dto.CreateSaleDTO;
import com.chaves.manageemployeeapi.dto.SaleDTO;

import java.util.List;

public interface SaleService {
    List<SaleDTO> findAll();
    SaleDTO create(CreateSaleDTO dto);
}
