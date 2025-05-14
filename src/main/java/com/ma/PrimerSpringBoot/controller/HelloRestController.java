package com.ma.PrimerSpringBoot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class HelloRestController {
    @GetMapping("/")
    @ResponseBody
    public String HelloWorld() {
        return  "Hello ";
    }


}
