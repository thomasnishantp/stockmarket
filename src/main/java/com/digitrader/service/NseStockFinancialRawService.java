package com.digitrader.service;

import com.digitrader.dao.NseStockFinancialRawDAO;
import com.digitrader.entity.NseStockFinancialRawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NseStockFinancialRawService {

    @Autowired
    private NseStockFinancialRawRepository repository;

    public NseStockFinancialRawDAO save(NseStockFinancialRawDAO entity) {
        return repository.save(entity);
    }

    public List<NseStockFinancialRawDAO> findByStockCode(String stockCode) {
        return repository.findByStockCode(stockCode);
    }

    public List<NseStockFinancialRawDAO> findByType(String type) {
        return repository.findByType(type);
    }

    public List<NseStockFinancialRawDAO> findAll() {
        return repository.findAll();
    }

    public NseStockFinancialRawDAO findByStockCodeType(String stockCode, String type) {
        return repository.findByStockCodeAndType(stockCode,type);
    }

    public List<NseStockFinancialRawDAO> findByTypeOrderByIdAsc(String type) {
        return repository.findByTypeOrderByIdAsc(type);
    }
}
