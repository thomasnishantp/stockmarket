package com.digitrader.service;

import com.digitrader.client.NseServiceClient;
import com.digitrader.dao.DhanDataDAO;
import com.digitrader.dao.NseStockFinancialRawDAO;
import com.digitrader.dto.NSEResponseDTO;
import com.digitrader.dto.NSEResultDTO;
import com.digitrader.entity.DhanDataRepository;
import com.digitrader.entity.NseStockFinancialRawRepository;
import com.digitrader.util.DateUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NseResultService {

    @Autowired
    private NseServiceClient nseServiceClient;

    @Autowired
    DhanDataRepository dhanDataRepository;

    @Autowired
    ScreenerResultsScraper screenerResultsScraper;


    public void getNseResult() throws JsonProcessingException {
        NSEResultDTO getDData = nseServiceClient.getNSEResponse();
        System.out.println(getDData.getResultMessage());
        List<NSEResponseDTO> list = getDData.getNseResponseDTOS();

        for(int i=0; i<list.size(); i++){
            String symbol = list.get(i).getSymbol();
            Optional<DhanDataDAO> optional = dhanDataRepository.findBySym(symbol);
            if(optional.get() != null){
                screenerResultsScraper.loadResultData(optional.get());
            }
        }

    }

}
