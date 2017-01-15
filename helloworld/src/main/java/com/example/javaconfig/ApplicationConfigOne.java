package com.example.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({ ApplicationConfig.class, AddressConfig.class })
@ImportResource({"basic.xml","javaannotation.xml"})
@ComponentScan(basePackages="com.example")
public class ApplicationConfigOne {

}
