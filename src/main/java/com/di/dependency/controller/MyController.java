package com.di.dependency.controller;
import com.di.dependency.GreetingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class MyController {

    @Autowired
    public GreetingController greetingController;

    public String hello()
    {
        System.out.println("+++++++++++HELLO++++++++++++");
        return greetingController.SayHello();

    }
}
