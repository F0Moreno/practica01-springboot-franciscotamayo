package com.ma.PrimerSpringBoot;

import com.ma.PrimerSpringBoot.service.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.ma.PrimerSpringBoot.service.CuadradoService;
import static org.junit.jupiter.api.Assertions.*;

class CuadradoServiceTest {


    CuadradoService service = new CuadradoService();

    @Test
    void testEsCuadradoTrue() {
        assertTrue(service.esCuadrado(4, 16));
    }

    @Test
    void testEsCuadradoFalse() {
        assertFalse(service.esCuadrado(3, 10));
    }
}
