//Recibe un número n de tipo byte y devuelve  su factorial de tipo float excepto en el caso de que sea negativo, en cuyo caso genera una excepción.
//El factorial de un número n es el producto de todos los números menores que él hasta el número 2.
//Casos especiales del factorial son factorial(0)=1 y factorial(1)=1.

package org.example.proyectoFactorial;

public final class Factorial {

    public static float factorial(byte n) throws Exception {

        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }
        float resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;

    }

}
