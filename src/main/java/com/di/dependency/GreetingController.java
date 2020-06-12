package com.di.dependency;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    public String SayHello()
    {
        System.out.println("Hellooooooo");
        return "hello";
    }
}
