package com.digitrader.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class FDResponse {
    private double maturityAmount;
    private LocalDate maturityDate;
    private LocalDate investedDate;
    private String summary;
    private List<MonthlyBreakup> monthlyBreakups;

    public FDResponse(double maturityAmount, LocalDate maturityDate, List<MonthlyBreakup> monthlyBreakups,
                      String summary,LocalDate investedDate) {
        this.maturityAmount = maturityAmount;
        this.maturityDate = maturityDate;
        this.monthlyBreakups = monthlyBreakups;
        this.investedDate = investedDate;
        this.summary = summary;
    }


}