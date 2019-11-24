package org.ecoding.limesieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LimesiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimesiEurekaApplication.class, args);
    }

}
