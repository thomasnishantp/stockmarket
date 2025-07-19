package com.digitrader.service;

import com.digitrader.dto.dhan.request.DhanRequestDTO;

public interface ProcessDhanRequest {
    public void proccessAllNSEData(DhanRequestDTO dhanListedStockDTO);
}
