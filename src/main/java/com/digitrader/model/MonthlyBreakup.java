package com.digitrader.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MonthlyBreakup {
    private int monthNumber;
    private LocalDate date;
    private double interestAccrued;
    private double totalAmount;
    private double returnAmount;

    public MonthlyBreakup(int monthNumber, LocalDate date, double interestAccrued, double totalAmount, double returnAmount) {
        this.monthNumber = monthNumber;
        this.date = date;
        this.interestAccrued = interestAccrued;
        this.totalAmount = totalAmount;
        this.returnAmount = returnAmount;
    }



}
