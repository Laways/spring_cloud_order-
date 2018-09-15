package com.imooc.order.bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.imooc")
@EnableDiscoveryClient
@MapperScan("com.imooc.order.dao")
public class OrderBootstrap {
    public static void main(String [] args){
        SpringApplication.run(OrderBootstrap.class,args);
    }
}
