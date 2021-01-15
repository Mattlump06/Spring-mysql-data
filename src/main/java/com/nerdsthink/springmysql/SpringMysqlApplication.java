package com.nerdsthink.springmysql;

import com.nerdsthink.springmysql.controllers.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
public class SpringMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMysqlApplication.class, args);
    }

}
