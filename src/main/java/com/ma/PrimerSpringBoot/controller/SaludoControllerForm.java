package com.ma.PrimerSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ma.PrimerSpringBoot.service.SaludoService;
import org.springframework.ui.Model;

import jakarta.validation.Valid;

@Controller
public class SaludoControllerForm {
    @Autowired
    private SaludoService service;

    @GetMapping("/saludoform")
    public String saludoForm(UserData userData) {
        return "formRegistro";
    }

    @PostMapping("/saludoform")
    public String checkPersonInfo(@ModelAttribute @Valid UserData userData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formRegistro";
        }
        model.addAttribute("mensaje", service.saludo(userData.getNombre()));
        return "saludo";

    }
}
