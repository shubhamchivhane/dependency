package com.di.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyApplication {

    public static void main(String[] args)
    {
        ApplicationContext ctx=SpringApplication.run(DependencyApplication.class, args);
        System.out.println("+++++++Hello++++++++");

    }

}
