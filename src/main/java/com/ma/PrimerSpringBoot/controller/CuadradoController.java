package com.ma.PrimerSpringBoot.controller;

import com.ma.PrimerSpringBoot.service.CuadradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CuadradoController {

    @Autowired
    private CuadradoService service;

    @GetMapping("/cuadradoform")
    public String mostrarFormulario(Model model) {
        model.addAttribute("numeros", new CuadradoControllerT());
        return "cuadradoform";
    }

    @PostMapping("/verificar")
    public String verificarCuadrado(@ModelAttribute CuadradoControllerT numeros, Model model) {
        boolean es = service.esCuadrado(numeros.getBase(), numeros.getCuadrado());
        String resultado = es ? "¡Correcto! Es el cuadrado." : "No es el cuadrado.";
        model.addAttribute("resultado", resultado);
        model.addAttribute("numeros", numeros);
        return "cuadradoform";
    }
}
