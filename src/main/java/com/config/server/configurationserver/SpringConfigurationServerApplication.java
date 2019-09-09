package com.config.server.configurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigurationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigurationServerApplication.class, args);
    }

}
