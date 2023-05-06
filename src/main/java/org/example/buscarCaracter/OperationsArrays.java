//Recibe un carácter c y un array de caracteres v de 10 elementos como máximo ordenados de forma ascendente.
//Devuelve el valor booleano true o false según encuentre el carácter en el array o no.
//La búsqueda es dicotómica, es decir, la primera busca se hace teniendo en cuenta to-do el array pero en las siguientes
//sólo se tiene en cuenta un segmento del obtenido mediante el cálculo del índice mitad del segmento y la comparación de c
//con el elemento almacenado en ese índice; si coincide, finaliza la búsqueda y se encuentra el carácter en el array;
//si c é menor, el siguiente segmento será la primera mitad del actual; si c es mayor,
//o siguiente segmento será a segunda mitad del actual. Si este proceso finaliza con un segmento nulo y no se encontró el carácter es que no existe.

package org.example.buscarCaracter;

public final class OperationsArrays {

    public static boolean busca(char c, char[] v) {

        int a, z, m;
        a = 0;
        z = v.length - 1;
        boolean resultado=false;

        while (a <= z && resultado==false) {
            m = (a + z) / 2;
            if (v[m] == c) {
                resultado=true;
            }
            else
            {
                if (v[m] < c) {
                    a = m + 1;
                }
                else{
                    z = m - 1;
                }
            }
        }
        return resultado;
    }
}
