package com.digitrader;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class StockMarketMain {

    public static void main(String[] args) {
        SpringApplication.run(StockMarketMain.class, args);
    }
}