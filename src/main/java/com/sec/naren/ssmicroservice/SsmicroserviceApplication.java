package com.sec.naren.ssmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SsmicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmicroserviceApplication.class, args);
    }

}
