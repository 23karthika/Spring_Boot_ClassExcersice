package com.classexcersice2.classexcersice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classexcersice2.classexcersice2.config.AppConfig;

@RestController
public class ApiController {
    @Autowired
    AppConfig appConfig;

    
    @GetMapping("/app-info")
    public String getAppInfo()
    {
        return "App Name: "+appConfig.getAppName()+"\nApp Version: "+appConfig.getAppVersion();
    }
}
