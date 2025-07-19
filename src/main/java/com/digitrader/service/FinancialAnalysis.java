package com.digitrader.service;

import com.digitrader.dto.FinancialData;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class FinancialAnalysis {

    public void analysisStock(String jsonString, String stockCode)throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(jsonString);

        // Parse data into Map<Quarter, FinancialData>
        Map<String, FinancialData> dataMap = new LinkedHashMap<>();
        for (Iterator<String> it = rootNode.fieldNames(); it.hasNext(); ) {
            String quarter = it.next();
            JsonNode node = rootNode.get(quarter);

            double sales = parseAmount(node.get("SALES") != null ? node.get("SALES").asText() : node.get("REVENUE").asText());
            double netProfit = parseAmount(node.get("NET_PROFIT").asText());
            double eps = node.get("EPS_IN_RS").asDouble();

            dataMap.put(quarter, new FinancialData(sales, netProfit, eps));
        }

        // Calculate YoY and QoQ growth and print results
        List<String> quarters = new ArrayList<>(dataMap.keySet());
        //Collections.sort(quarters);
       // log.info("Stock Analysis report for Stock Code {} ",stockCode);
        //log.info("Quarter\tSales QoQ%\tSales YoY%\tNet Profit QoQ%\tNet Profit YoY%\tEPS QoQ%\tEPS YoY%");

        int re = 0;
        for (int i = 0; i < quarters.size(); i++) {
            String current = quarters.get(i);
            FinancialData currentData = dataMap.get(current);

            String prevQuarter = (i > 0) ? quarters.get(i - 1) : null;
            String prevYearQuarter = getPrevYearQuarter(current, quarters);

            FinancialData prevQData = (prevQuarter != null) ? dataMap.get(prevQuarter) : null;
            FinancialData prevYData = (prevYearQuarter != null) ? dataMap.get(prevYearQuarter) : null;

            if (prevQData != null) {
                if(currentData.getNetProfit() > prevQData.getNetProfit()){
                    re += 1;
                }
            }

            double salesQoQ = (prevQData != null) ? percentChange(currentData.getSales(), prevQData.getSales()) : 0;
            double salesYoY = (prevYData != null) ? percentChange(currentData.getSales(), prevYData.getSales()) : 0;

            double netProfitQoQ = (prevQData != null) ? percentChange(currentData.getNetProfit(), prevQData.getNetProfit()) : 0;
            double netProfitYoY = (prevYData != null) ? percentChange(currentData.getNetProfit(), prevYData.getNetProfit()) : 0;

            double epsQoQ = (prevQData != null) ? percentChange(currentData.getEps(), prevQData.getEps()) : 0;
            double epsYoY = (prevYData != null) ? percentChange(currentData.getEps(), prevYData.getEps()) : 0;

//            System.out.printf("%s\t%.2f%%\t\t%.2f%%\t\t%.2f%%\t\t%.2f%%\t\t%.2f%%\t\t%.2f%%\n",
//                    current, salesQoQ, salesYoY, netProfitQoQ, netProfitYoY, epsQoQ, epsYoY);
        }

        // Simple Buy Recommendation
        // Criteria: Last quarter EPS YoY > 10% and Net Profit QoQ > 5% and Operating Margin >= 17%
        String lastQuarter = quarters.get(quarters.size() - 1);
        FinancialData lastData = dataMap.get(lastQuarter);

        String prevYearQuarter = getPrevYearQuarter(lastQuarter, quarters);
        FinancialData prevYearData = (prevYearQuarter != null) ? dataMap.get(prevYearQuarter) : null;

        double epsYoYLast = (prevYearData != null) ? percentChange(lastData.getEps(), prevYearData.getEps()) : 0;

        // Operating Margin from original data JSON
        double opMargin = parsePercentage(rootNode.get(lastQuarter).get("OPM_PRCNTG") != null ?
                rootNode.get(lastQuarter).get("OPM_PRCNTG").asText() : rootNode.get(lastQuarter).get("FINANCING_MARGIN_PRCNTG").asText());

        if (epsYoYLast > 10 && opMargin >= 17) {
            log.info("Recommendation for Stock Code {} : BUY the stock based on strong EPS growth and healthy operating margin. epsYoYLast {}, opMargin {}, re {} Total Q {}",stockCode,epsYoYLast,opMargin, re,quarters.size());
        } else {
            log.info("Recommendation for Stock Code {} : HOLD or AVOID based on current financial trends. epsYoYLast {}, opMargin {}, re {} Total Q {}",stockCode,epsYoYLast,opMargin, re,quarters.size());
        }
    }

    private static double parseAmount(String amountStr) {
        return Double.parseDouble(amountStr.replace(",", ""));
    }

    private static double parsePercentage(String percentStr) {
        return percentStr.isEmpty() ? 0.0 : Double.parseDouble(percentStr.replace("%", "").replace(",", ""));
    }

    private static double percentChange(double current, double previous) {
        if (previous == 0) return 0;
        return ((current - previous) / previous) * 100;
    }

    private static String getPrevYearQuarter(String quarter, List<String> quarters) {
        // quarter format: "MAR_2023", "JUN_2023", etc.
        String[] parts = quarter.split("_");
        String mon = parts[0];
        int year = Integer.parseInt(parts[1]);
        String prevYearQuarter = mon + "_" + (year - 1);
        return quarters.contains(prevYearQuarter) ? prevYearQuarter : null;
    }
}
