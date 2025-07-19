package com.digitrader.dao;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nsestock_financial_raw", uniqueConstraints = {@UniqueConstraint(name = "symbolField",columnNames = {"stock_code,type"})})
public class NseStockFinancialRawDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "stock_code", nullable = false)
    private String stockCode;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "data", columnDefinition = "TEXT")
    private String data;

    @Column(name = "status")
    private Integer status;
}

