package com.digitrader.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinancialData {
    double sales;
    double netProfit;
    double eps;

    public FinancialData(double sales, double netProfit, double eps) {
        this.sales = sales;
        this.netProfit = netProfit;
        this.eps = eps;
    }
}
