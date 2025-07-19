package com.digitrader.service;

import com.digitrader.model.FDRequest;
import com.digitrader.model.FDResponse;
import com.digitrader.model.MonthlyBreakup;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class FDService {

    public FDResponse calculateMaturity(FDRequest request) {
        double principal = request.getPrincipal();
        double annualRate = request.getAnnualInterestRate();
        int tenureMonths = request.getTenureInMonths();

        double currentAmount = principal;

        List<MonthlyBreakup> breakupList = new ArrayList<>();
        LocalDate startDate = null;
        if(request.getInvestedDate() == null) {
            startDate = LocalDate.now();
        }else{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            startDate = LocalDate.parse(request.getInvestedDate(), dtf);
        }

        for (int month = 1; month <= tenureMonths; month++) {
            LocalDate currentDate = startDate.plusMonths(month);
            double interest = 0.0;
            double returnAmount = 0.0;
            // Apply quarterly interest every 3 months
            if (request.getTypeOfDeposit() == 1) {
                if (month % 3 == 0) {
                    double quarterlyRate = annualRate / 4 / 100; // Quarterly interest
                    interest = currentAmount * quarterlyRate;
                    currentAmount += interest;
                }
            } else if (request.getTypeOfDeposit() == 2) {
                double monthlyRate = annualRate / 12 / 100; // Monthly interest
                interest = currentAmount * monthlyRate;
                currentAmount += interest;
            }else if (request.getTypeOfDeposit() == 3) {
                if (month % 3 == 0) {
                    double monthlyRate = annualRate / 4 / 100; // Quarterly interest
                    interest = currentAmount * monthlyRate;
                    returnAmount = interest;
                }
            }else if (request.getTypeOfDeposit() == 4) {
                    double monthlyRate = annualRate / 12 / 100; // Monthly interest
                    interest = currentAmount * monthlyRate;
                    returnAmount = interest;
            }

            breakupList.add(new MonthlyBreakup(month, currentDate, roundToTwoDecimals(interest),
                    roundToTwoDecimals(currentAmount),roundToTwoDecimals(returnAmount) ));
        }

        return new FDResponse(roundToTwoDecimals(currentAmount), startDate.plusMonths(tenureMonths),
                breakupList,request.getSummary(),startDate);
    }

    private double roundToTwoDecimals(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}