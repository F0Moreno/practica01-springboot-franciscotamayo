package com.ma.PrimerSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

    @RequestMapping("/hola")
    public String helloHandler() {
        return "hello";
    }
}
