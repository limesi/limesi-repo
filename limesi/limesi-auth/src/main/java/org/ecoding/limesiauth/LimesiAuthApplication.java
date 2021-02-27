package org.ecoding.limesiauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
@MapperScan("org.ecoding.limesiauth.mapper")
public class  LimesiAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimesiAuthApplication.class, args);
    }

}
