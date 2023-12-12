/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * crear un metodo recursivo para obtener la multiplicacion(c,d)  
  * @author Antony Cobos
  * @version 1.0
  */

public class MultiplicacionRecursiva {

    // Método recursivo para realizar la multiplicación de dos números
    public static int realizarMultiplicacion(int c, int d) {
        // Caso base: cuando b es 0, la multiplicación es 0
        if (d == 0) {
            return 0;
        }
        // Caso recursivo: a * b = a + (a * (b - 1))
        return c + realizarMultiplicacion(c, d - 1);
    }

   
}
