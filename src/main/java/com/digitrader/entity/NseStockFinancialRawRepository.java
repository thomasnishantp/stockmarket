package com.digitrader.entity;

import com.digitrader.dao.NseStockFinancialRawDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface NseStockFinancialRawRepository extends JpaRepository<NseStockFinancialRawDAO, Long> {
    // Custom query methods (if needed) can go here
    List<NseStockFinancialRawDAO> findByStockCode(String stockCode);
    List<NseStockFinancialRawDAO> findByType(String type);
    NseStockFinancialRawDAO findByStockCodeAndType(String stockCode, String type);
    List<NseStockFinancialRawDAO> findByTypeOrderByIdAsc(String type);
}
