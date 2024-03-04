package com.test.practica.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClientConfig {

  /*  @Value("${sale.order-delivery.host}")
    private String saleOrderDeliveryHost;
    @Value("${sale.order-domain.host}")
    private String saleOrdenDomainHost;
    @Value("${sale.logistics.host}")
    private String saleLogisticsHost;
    @Value("${sale.siebel.host}")
    private String saleSiebelHost;
    @Value("${sale.integration-sap.host}")
    private String saleIntegrationSapHost;
    @Value("${sale.integration-blip.host}")
    private String saleIntegrationBlipHost;


    @Bean("orderDeliveryWebClient")
    public WebClient orderDeliveryWebClient() {
        return WebClient.create(saleOrderDeliveryHost + "/order/v1");
    }

    @Bean("integrationSapWebClient")
    public WebClient integrationSAPWebClient() {
        return WebClient.create(saleIntegrationSapHost + "/sap/v1");
    }

    @Bean("saleOrdenDomainHost")
    public WebClient ordenDomainWebClient() { return WebClient.builder()
            .baseUrl(saleOrdenDomainHost + "/sale/v1")
            .build();
    }

    @Bean("logisticsWebClient")
    public WebClient logisticsWebClient() {
        return WebClient.create(saleLogisticsHost + "/logistics/v1");
    }

    @Bean("siebelWebClient")
    public WebClient siebelWebClient() {
        return WebClient.create(saleSiebelHost + "/siebel/v1");
    }

    @Bean("blipWebClient")
    public WebClient blipWebClient() {
        return WebClient.create(saleIntegrationBlipHost + "/blip/v1");
    }*/
}
