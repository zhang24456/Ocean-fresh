package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class demo {
    @RequestMapping("demo")
    void demo(){
        System.out.println("233333333");
    }
}
