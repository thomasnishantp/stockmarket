package com.digitrader.client;

import com.digitrader.dto.dhan.request.DhanRequestDTO;
import com.digitrader.dto.dhan.response.DhanResponseDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

public interface DhanServiceClient {

    @PostExchange("/customscan/fetchdt")
    public DhanResponseDTO getDhanResponse(@RequestBody DhanRequestDTO dhanRequestDTO);

}
