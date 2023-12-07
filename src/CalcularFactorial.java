/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Crear un metodo recursivo para obtener factorial(n) 
  * @author Antony Cobos
  * @version 1.0
  */

public class CalcularFactorial {

    // Método recursivo para calcular el factorial
    public static long calcularFactorial(int n) {
        // Caso base: el factorial de 0 es 1
        if (n == 0) {
            return 1;
        }
        // Caso recursivo: n! = n * (n-1)!
        return n * calcularFactorial(n - 1);
    }

}
