package org.example.proyectoAcronimos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcronimosTest {

    @Test
    void obtenerAcronimo() {
        Assertions.assertEquals("O.N.U.",Acronimos.obtenerAcronimo("Organizacion Naciones Unidas"));
        Assertions.assertEquals("E.U.I.T.I.",Acronimos.obtenerAcronimo("Escuela Universitaria Ingeniería Técnica Industrial"));
        Assertions.assertEquals("o.v.n.i.",Acronimos.obtenerAcronimo("objeto volante no identificada"));
    }
}