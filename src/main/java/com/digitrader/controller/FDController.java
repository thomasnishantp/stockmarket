package com.digitrader.controller;

import com.digitrader.model.FDRequest;
import com.digitrader.model.FDResponse;
import com.digitrader.service.FDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fd")
public class FDController {

    @Autowired
    private FDService fdService;

    @PostMapping("/calculate")
    public FDResponse calculate(@RequestBody FDRequest request) {
        return fdService.calculateMaturity(request);
    }
}
