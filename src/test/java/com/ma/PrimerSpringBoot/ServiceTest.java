package com.ma.PrimerSpringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ma.PrimerSpringBoot.service.SaludoService;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class ServiceTest {

    @Autowired
    SaludoService saluda;
    @Test
    public void contextLoads() throws Exception {

        assertThat(saluda).isNotNull();
    }

    @Test
    public void serviceSaludo()throws Exception {
        assertThat(saluda.saludo("Francisco")).isEqualTo("Hola Francisco desde el servicio!");
    }
}
