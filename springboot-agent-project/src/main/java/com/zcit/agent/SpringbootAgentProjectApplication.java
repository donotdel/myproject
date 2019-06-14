package com.zcit.agent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zcit.agent.model.mapper")
public class SpringbootAgentProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAgentProjectApplication.class, args);
    }
}
