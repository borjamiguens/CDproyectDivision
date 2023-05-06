//Recibe un dividendo y un divisor de tipo float y devuelve el resultado de la división
//también de tipo float siempre que el divisor no sea 0, en cuyo caso generará una excepción.

package org.example.proyectoDivision;



public final class Division {//le digo que es final porque no voy a necesitar instanciar objetos Division

    public static float calcularDivision(float dividendo, float divisor) throws Exception {
        //el metodo calcularDivision puede ser estatico porque no accedo a ningúna propiedad del objeto
        //entonces no necesito crear un objeto
        if (divisor == 0) {
            throw (new Exception("Error. El divisor no puede ser 0."));
        }
        float resultado = dividendo / divisor;
        return resultado;
    }

}
