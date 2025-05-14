package com.ma.PrimerSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class CuadradoService {
    public boolean esCuadrado(int base, int cuadrado) {
        return base * base == cuadrado;
    }
}
