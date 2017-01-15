package com.example.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.basic.CustomerInfo;
 
@Configuration
public class ApplicationConfig {
 
    @Bean(name="cusInfo")
    public CustomerInfo getCustomerInfo() {
        return new CustomerInfo();
    }
 
}