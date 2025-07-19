package com.digitrader.config;

import com.digitrader.client.DhanServiceClient;
import com.digitrader.client.NseServiceClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class NseConfiguration {

    @Value("${nse.base.url}")
    private String baseUrl;

    @Bean
    public NseServiceClient getNseServiceClient(){
        return HttpServiceProxyFactory.builderFor(WebClientAdapter.
                create(WebClient.builder().baseUrl(baseUrl).build())).build().createClient(NseServiceClient.class);
    }
}
