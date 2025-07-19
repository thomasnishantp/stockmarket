package com.digitrader.service;

import com.digitrader.client.DhanServiceClient;
import com.digitrader.dto.dhan.request.DhanRequestDTO;
import com.digitrader.dto.dhan.response.DhanResponseDTO;
import com.digitrader.dto.dhan.response.DhanResponseDatumDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class ProcessDhanRequestImpl implements ProcessDhanRequest{

    @Autowired
    DhanServiceClient dhanServiceClient;

    @Autowired
    DhanDataService dhanDataService;

    @Override
    public void proccessAllNSEData(DhanRequestDTO dhanListedStockDTO) {
        List<DhanResponseDatumDTO> dhanResponseDatumDTOList = getResponseData(dhanListedStockDTO);
        log.info("Process of fetching NSE Data Completed. Total Records{}",dhanResponseDatumDTOList.size());
        for (int i = 0; i < dhanResponseDatumDTOList.size(); i++) {
            dhanDataService.saveNSEBySymbol(dhanResponseDatumDTOList.get(i));
        }
    }

    private List<DhanResponseDatumDTO> getResponseData(DhanRequestDTO dhanListedStockDTO) {
        log.info("Process Started for Dhan Fetch Started !!");
        List<DhanResponseDatumDTO> dhanResponseDatumDTOList = new ArrayList<>();
        int counter = 0;
        boolean condition = true;
        while(condition) {
            dhanListedStockDTO.getData().setPgno(counter);
            DhanResponseDTO dhanResponseDTO = dhanServiceClient.getDhanResponse(dhanListedStockDTO);
            if(dhanResponseDTO.getTotPg() == counter){
                condition = false;
            }
            dhanResponseDatumDTOList.addAll(dhanResponseDTO.getData());
            counter++;
        }
        log.info("Process Started for Dhan Fetch completed !!");
        return dhanResponseDatumDTOList;
    }
}
