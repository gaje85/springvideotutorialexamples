package com.example.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.basic.Address;

@Configuration
public class AddressConfig {
	

    @Bean(name="address")
    @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Address getAdd() {
        return new Address();
    }

}
