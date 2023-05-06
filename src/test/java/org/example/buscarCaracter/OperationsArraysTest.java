package org.example.buscarCaracter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class OperationsArraysTest {

    @BeforeEach
    void setUp() {


    }

    @Test
    void busca() {
        char[] cadena1= {'c','o','c','h','e'};
        Assertions.assertEquals(true, OperationsArrays.busca('c', cadena1));
        Assertions.assertEquals(false, OperationsArrays.busca('a', cadena1));
    }
}