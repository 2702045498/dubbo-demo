package com.bange.bangemall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.Arrays;

/**
 * 服务提供者的启动类
 */
@SpringBootApplication
@EnableDubbo
public class OrderProviderAppication
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(OrderProviderAppication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
