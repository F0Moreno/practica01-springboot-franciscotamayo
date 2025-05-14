package com.ma.PrimerSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ma.PrimerSpringBoot.service.SaludoService;

@Controller
public class SaludoController {
    @Autowired
    private SaludoService service;

    @RequestMapping("/saludo/{nombre}")
    public @ResponseBody  String saludo(@PathVariable(value = "nombre") String nombre) {
        return service.saludo(nombre);
    }

}
