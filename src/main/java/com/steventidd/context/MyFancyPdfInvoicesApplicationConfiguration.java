package com.steventidd.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.steventidd.service.InvoiceService;
import com.steventidd.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFancyPdfInvoicesApplicationConfiguration {

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public InvoiceService invoiceService(UserService userService){
        return new InvoiceService(userService);
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }



}
