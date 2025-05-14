package com.ma.PrimerSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saludo(String nombre) {
        return "Hola " + nombre + " desde el servicio!";
    }

}
