package com.digitrader.client;

import com.digitrader.dto.NSEResponseDTO;
import com.digitrader.dto.NSEResultDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface NseServiceClient {

    @GetExchange("/webapi/Other/forth-comming-data")
    public NSEResultDTO getNSEResponse();

}
