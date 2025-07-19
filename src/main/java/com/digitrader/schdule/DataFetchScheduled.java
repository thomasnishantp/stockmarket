package com.digitrader.schdule;

import com.digitrader.dao.DhanDataDAO;
import com.digitrader.dao.NseStockFinancialRawDAO;
import com.digitrader.dto.dhan.request.DhanRequestDataDTO;
import com.digitrader.dto.dhan.request.DhanRequestDTO;
import com.digitrader.dto.dhan.request.DhanRequestParamDTO;
import com.digitrader.entity.DhanDataRepository;
import com.digitrader.service.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class DataFetchScheduled {
    
    @Autowired
    ProcessDhanRequest processDhanRequest;

    @Autowired
    DhanDataRepository dhanDataRepository;

    @Autowired
    ScreenerResultsScraper screenerResultsScraper;

    @Autowired
    NseStockFinancialRawService nseStockFinancialRawService;

    @Autowired
    FinancialAnalysis financialAnalysis;

    @Autowired
    NseResultService nseResultService;

    @Scheduled(cron = "${spring.dhan.cron}")
    public void processRecord() throws IOException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
            objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            objectMapper.enable(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION);
            InputStream is = DataFetchScheduled.class.getResourceAsStream("/dhanNse.json");
            DhanRequestDTO dhanListedStockDTO = objectMapper.readValue(is, DhanRequestDTO.class);
            processDhanRequest.proccessAllNSEData(dhanListedStockDTO);
        }catch (IOException e){
            log.info("Exception Occur {} ",e.getMessage());
        }
    }

    //@Scheduled(fixedDelay = 1000)
    public void processData() throws JsonProcessingException {
        List<DhanDataDAO> dhanDataDAOS = dhanDataRepository.findByStatusOrderByMcapDesc("1");
        screenerResultsScraper.getResults(dhanDataDAOS);
    }

    //@Scheduled(fixedDelay = 1000)
    public void getNSEData() throws Exception {
        nseResultService.getNseResult();
    }

    @Scheduled(fixedDelay = 100000)
    public void analysisData() throws Exception {
        List<NseStockFinancialRawDAO> nseStockFinancialRawDAOS = nseStockFinancialRawService.findByTypeOrderByIdAsc("QUARTERLY_RESULTS");
        for (int i = 0; i < nseStockFinancialRawDAOS.size(); i++) {
            if(!nseStockFinancialRawDAOS.get(i).getData().trim().equals("{ }")) {
                financialAnalysis.analysisStock(nseStockFinancialRawDAOS.get(i).getData(), nseStockFinancialRawDAOS.get(i).getStockCode());
            }
        }
    }

    //@Scheduled(fixedDelay = 1000)
    public void processRecord1() throws IOException {
        DhanRequestParamDTO param = DhanRequestParamDTO.builder().field("OgInst").val("ES").op("").build();
        DhanRequestParamDTO param1 = DhanRequestParamDTO.builder().field("Exch").val("NSE").op("").build();
        List<DhanRequestParamDTO> params = Arrays.asList(param1,param);
        List<String> fields = Arrays.asList("Isin",
                "DispSym",
                "Mcap",
                "Pe",
                "DivYeild",
                "Revenue",
                "Year1RevenueGrowth",
                "NetProfitMargin",
                "YoYLastQtrlyProfitGrowth",
                "EBIDTAMargin",
                "volume",
                "PricePerchng1year",
                "PricePerchng3year",
                "PricePerchng5year",
                "Ind_Pe",
                "Pb",
                "DivYeild",
                "Eps",
                "DaySMA50CurrentCandle",
                "DaySMA200CurrentCandle",
                "DayRSI14CurrentCandle",
                "ROCE",
                "Roe",
                "Sym",
                "PricePerchng1mon",
                "PricePerchng3mon");

        DhanRequestDataDTO data = DhanRequestDataDTO.builder().sort("Mcap").sorder("desc").count(20).
                params(params).fields(fields).pgno(0).build();

        DhanRequestDTO listedStockDTO = DhanRequestDTO.builder().data(data).build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("target/listedStockDTO.json"), listedStockDTO);
    }
}
