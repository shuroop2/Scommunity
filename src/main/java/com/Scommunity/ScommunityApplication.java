package com.Scommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.Scommunity.project"})
//@MapperScan(basePackages = {"com.Scommunity.project"})
public class ScommunityApplication {

    public static void main(String[] args) {
		SpringApplication.run(ScommunityApplication.class, args);
    }

}
