package com.digitrader.service;

import com.digitrader.dao.DhanDataDAO;
import com.digitrader.dao.NseStockFinancialRawDAO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class ScreenerResultsScraper {

    @Autowired
    NseStockFinancialRawService stockFinancialRawService;

    public void getResults(List<DhanDataDAO> dhanDataDAOS) throws JsonProcessingException {
        LinkedHashMap<String, LinkedHashMap<String,LinkedHashMap<String, LinkedHashMap<String, String>>>> finalData = new LinkedHashMap<>();
        for (int i = 0; i < dhanDataDAOS.size(); i++) {
            if(dhanDataDAOS.get(i).getMcap() != null) {
                String url = "https://www.screener.in/company/" + dhanDataDAOS.get(i).getSym() + "/";

                log.info("Stock Holder Fetch {} ",dhanDataDAOS.get(i).getSym());
                try {
                    Document doc = Jsoup.connect(url).get();
                    Elements elements = doc.getElementsByClass("data-table responsive-text-nowrap");
                    LinkedHashMap<String,LinkedHashMap<String, LinkedHashMap<String, String>>> hashMap = new LinkedHashMap<>();
                    hashMap.put("Quarterly_Results".toUpperCase(),this.getDetails(elements.get(0)));
                    hashMap.put("Profit_Loss".toUpperCase(),this.getDetails(elements.get(1)));
                    hashMap.put("Balance_Sheet".toUpperCase(),this.getDetails(elements.get(2)));
                    hashMap.put("Cash_Flows".toUpperCase(),this.getDetails(elements.get(3)));
                    hashMap.put("Ratios".toUpperCase(),this.getDetails(elements.get(4)));
                    Elements shareHolder = doc.selectXpath("//div[@id='quarterly-shp']/div/table[@class='data-table']");
                    hashMap.put("Shareholding_Pattern".toUpperCase(),this.getDetails(shareHolder.get(0)));
                    finalData.put(dhanDataDAOS.get(i).getSym(),hashMap);
                    this.getFinancialRawDAO(dhanDataDAOS.get(i).getSym(),hashMap);
                    Thread.sleep(2500 );
                    dhanDataDAOS.get(i).setStatus("1");
                } catch (Exception e) {
                    log.error("Invalid Stock details! Unable to fetch the data {}",dhanDataDAOS.get(i).getSym());
                    dhanDataDAOS.get(i).setStatus("0");
                }
            }
        }
    }

    public void loadResultData(DhanDataDAO dhanDataDAOS) throws JsonProcessingException {
        LinkedHashMap<String, LinkedHashMap<String,LinkedHashMap<String, LinkedHashMap<String, String>>>> finalData = new LinkedHashMap<>();
            if(dhanDataDAOS.getMcap() != null) {
                String url = "https://www.screener.in/company/" + dhanDataDAOS.getSym() + "/";
                log.info("Stock Holder Fetch {} ",dhanDataDAOS.getSym());
                try {
                    Document doc = Jsoup.connect(url).get();
                    Elements elements = doc.getElementsByClass("data-table responsive-text-nowrap");
                    LinkedHashMap<String,LinkedHashMap<String, LinkedHashMap<String, String>>> hashMap = new LinkedHashMap<>();
                    hashMap.put("Quarterly_Results".toUpperCase(),this.getDetails(elements.get(0)));
                    hashMap.put("Profit_Loss".toUpperCase(),this.getDetails(elements.get(1)));
                    hashMap.put("Balance_Sheet".toUpperCase(),this.getDetails(elements.get(2)));
                    hashMap.put("Cash_Flows".toUpperCase(),this.getDetails(elements.get(3)));
                    hashMap.put("Ratios".toUpperCase(),this.getDetails(elements.get(4)));
                    Elements shareHolder = doc.selectXpath("//div[@id='quarterly-shp']/div/table[@class='data-table']");
                    hashMap.put("Shareholding_Pattern".toUpperCase(),this.getDetails(shareHolder.get(0)));
                    finalData.put(dhanDataDAOS.getSym(),hashMap);
                    this.getFinancialRawDAO(dhanDataDAOS.getSym(),hashMap);
                    Thread.sleep(2500 );
                    dhanDataDAOS.setStatus("1");
                } catch (Exception e) {
                    log.error("Invalid Stock details! Unable to fetch the data {}",dhanDataDAOS.getSym());
                    dhanDataDAOS.setStatus("0");
                }
        }
    }

    public LinkedHashMap<String, LinkedHashMap<String, String>> getDetails(Element element){
        ArrayList<String> rowHeaders = new ArrayList<>();
        ArrayList<String> columnHeaders = new ArrayList<>();
        Elements headerCells = element.select("thead tr th");
        for (Element th : headerCells) {
            String header = th.text().replace(" +", "")
                    .toUpperCase().replace(" %","_PRCNTG")
                    .replace(" ","_").replace(".","");
            columnHeaders.add(header);

        }
        // Extract rows

        Elements rows = element.select("tbody tr");
        LinkedHashMap<String, LinkedHashMap<String, String>> data = new LinkedHashMap<>();

        for (int row = 0; row < rows.size(); row++) {
            Elements cells = rows.get(row).select("td, th");
            String header = cells.get(0).text().replace(" +", "")
                    .toUpperCase().replace(" %","_PRCNTG")
                    .replace(" ","_").replace(".","");
            rowHeaders.add(header);
        }

        for (int row = 0 ; row < rows.size(); row++) {
            Elements dataCell = rows.get(row).select("td, th");
            for (int cell = 1; cell < dataCell.size(); cell++) {
                if (data.containsKey(columnHeaders.get(cell))) {
                    LinkedHashMap<String, String> dataMap = data.get(columnHeaders.get(cell));
                    dataMap.put(rowHeaders.get(row), dataCell.get(cell).text());
                } else {
                    LinkedHashMap<String, String> dataMap = new LinkedHashMap<>();
                    dataMap.put(rowHeaders.get(row), dataCell.get(cell).text());
                    data.put(columnHeaders.get(cell), dataMap);
                }
            }
        }

        return data;
    }

    public void getFinancialRawDAO(String stockCode,
                                                      LinkedHashMap<String,LinkedHashMap<String,
                                                              LinkedHashMap<String, String>>> rawData) throws JsonProcessingException {
        for( Map.Entry<String,LinkedHashMap<String,
                LinkedHashMap<String, String>>> entry : rawData.entrySet()){
            String key = entry.getKey();
            NseStockFinancialRawDAO nseStockFinancialRawDAO = stockFinancialRawService.findByStockCodeType(stockCode,key);
            if(nseStockFinancialRawDAO != null){
                ObjectMapper objectMapper = new ObjectMapper();
                String data = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rawData.get(key));
                nseStockFinancialRawDAO.setData(data);
                nseStockFinancialRawDAO.setStatus(1);
                stockFinancialRawService.save(nseStockFinancialRawDAO);
            }else{
                ObjectMapper objectMapper = new ObjectMapper();
                String data = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rawData.get(key));
                nseStockFinancialRawDAO = NseStockFinancialRawDAO.builder().type(key).stockCode(stockCode).data(data)
                        .status(1).build();
                nseStockFinancialRawDAO.setData(data);
                stockFinancialRawService.save(nseStockFinancialRawDAO);
            }
        }
    }
}