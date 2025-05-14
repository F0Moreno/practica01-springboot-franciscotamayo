package com.ma.PrimerSpringBoot;

import com.ma.PrimerSpringBoot.controller.CuadradoController;
import com.ma.PrimerSpringBoot.service.CuadradoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CuadradoController.class)
public class CuadradoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CuadradoService service;

    @Test
    public void testVerificarCuadrado() throws Exception {
        when(service.esCuadrado(3, 9)).thenReturn(true);

        mockMvc.perform(post("/verificar")
                        .param("base", "3")
                        .param("cuadrado", "9"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("resultado"))
                .andExpect(view().name("cuadradoform"));
    }
}
