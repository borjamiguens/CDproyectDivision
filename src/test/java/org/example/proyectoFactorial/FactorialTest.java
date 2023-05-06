package org.example.proyectoFactorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() throws Exception {
        Assertions.assertEquals(120, Factorial.factorial((byte) 5));
        Assertions.assertEquals(720, Factorial.factorial((byte) 6));
        Assertions.assertEquals(1, Factorial.factorial((byte) 1));
    }
}