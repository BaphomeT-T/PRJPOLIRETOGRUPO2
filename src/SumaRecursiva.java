/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Crear un metodo recursivo para obtener la suma(a,b) 
  * @author Antony Cobos
  * @version 1.0
  */

public class SumaRecursiva {

    // Método recursivo para obtener la suma de dos números
    public static int obtenerSuma(int a, int b) {
        // Caso base: cuando b es 0, la suma es a
        if (b == 0) {
            return a;
        }
        // Caso recursivo: a + b = (a + 1) + (b - 1)
        return obtenerSuma(a + 1, b - 1);
    }

}
