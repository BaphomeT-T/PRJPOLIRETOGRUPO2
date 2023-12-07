/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Crear un metodo recursivo para obtener la potencia(e,f)  
  * @author Antony Cobos
  * @version 1.0
  */

public class PotenciaRecursiva {

    // Método recursivo para calcular la potencia de a^b
    public static int calcularPotencia(int e, int f) {
        // Caso base: cuando b es 0, la potencia es 1
        if (f == 0) {
            return 1;
        }
        // Caso recursivo: a^b = a * a^(b-1)
        return e * calcularPotencia(e, f - 1);
    }


 }