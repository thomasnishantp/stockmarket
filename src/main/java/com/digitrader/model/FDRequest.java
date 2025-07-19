package com.digitrader.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class FDRequest {
    private double principal;
    private double annualInterestRate;
    private int tenureInMonths;
    private int typeOfDeposit;
    private String investedDate;
    private String summary;
}