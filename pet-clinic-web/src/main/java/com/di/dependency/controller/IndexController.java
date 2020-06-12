package com.di.dependency.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    Logger logger = LoggerFactory.getLogger(IndexController.class);
    
    @RequestMapping({"","/","index","index.html"})
    public String index()
    {
        logger.info("++++++Inside Index Controller++++++++++++");
        return "index";
    }
}
