package org.example;

public final class Division {//le digo que es final porque non voy a necesitar instanciar objetos Division

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
