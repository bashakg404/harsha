package com.SpringRestService.RestDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "com.SpringRestService.RestDemo")
public class ApplicationConfiguration {

}
