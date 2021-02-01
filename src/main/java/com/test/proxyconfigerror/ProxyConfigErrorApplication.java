package com.test.proxyconfigerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(proxyBeanMethods = false)
@EnableJpaRepositories(basePackages = {"com.test.proxyconfigerror.database.controllers"})
@EntityScan(basePackages = {"com.test.proxyconfigerror.database.entities"})
@ComponentScan("com.test")
@EnableCaching(proxyTargetClass = true)
public class ProxyConfigErrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyConfigErrorApplication.class, args);
    }

}
