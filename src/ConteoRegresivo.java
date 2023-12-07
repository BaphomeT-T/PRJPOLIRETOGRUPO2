/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Crear un metodo recursivo para obtener la conteoRegresivo(x)  hasta 0 / imprimir el avance
  * @author Antony Cobos
  * @version 1.0
  */

public class ConteoRegresivo {

    // Método recursivo para realizar un conteo regresivo desde x hasta 1
    public static void conteoRegresivoDesde(int x) {
        conteoRegresivo(x);
    }

    private static void conteoRegresivo(int actual) {
        // Caso base: cuando actual llega a 1, termina la recursividad
        if (actual == 0) {
            return;
        }

        // Imprimir el avance en la misma línea y borrar la línea anterior
        System.out.print("\033[KConteo regresivo: " + actual);

        // Dormir durante 1 segundo (1000 milisegundos)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Retroceder al inicio de la línea antes de imprimir el siguiente número
        System.out.print("\r");

        // Llamada recursiva con el siguiente número
        conteoRegresivo(actual - 1);
    }

}
