//Recibe una cadena de caracteres y retorna una cadena con el acrónimo correspondiente.
//El acrónimo está formado por el primer carácter de cada palabra seguidos de un punto cuando el carácter es diferente de espacio en blanco.

package org.example.proyectoAcronimos;

public final class Acronimos {

    public static String obtenerAcronimo(String cadena) {

        String resultado = "";
        char caracter;
        int n = cadena.length();

        for (int i = 0; i < n; i++) {
            caracter = cadena.charAt(i);
            if (caracter != ' ') {
                if (i == 0) {
                    resultado = resultado + caracter + '.';
                } else {
                    if (cadena.charAt(i - 1) == ' ') {
                        resultado = resultado + caracter + '.';
                    }
                }
            }
        }
        return resultado;
    }
}
