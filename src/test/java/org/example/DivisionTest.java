package org.example;

import org.example.proyectoDivision.Division;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calcularDivision() throws Exception {
        Assertions.assertEquals(250.0f, Division.calcularDivision(500.0f,2.0f));
        Assertions.assertEquals(100.0f, Division.calcularDivision(500.0f,5.0f));
        Assertions.assertEquals(50.0f, Division.calcularDivision(500.0f,10.0f));

    }
}