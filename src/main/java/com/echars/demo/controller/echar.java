package com.echars.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class echar {
    @RequestMapping("testEchar")
    public String testEchar(){

        return "index";
    }
}
