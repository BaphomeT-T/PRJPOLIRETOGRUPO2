/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Crear un metodo recursivo para obtener la conteoProgregresivoHasta(m) / imprimir el avance
  * @author Antony Cobos
  * @version 1.0
  */

public class ConteoProgresivo {

    // Método recursivo para realizar un conteo progresivo hasta n
    public static void conteoProgresivoHasta(int m, int actual) {
        // Caso base: cuando actual alcanza n, termina la recursividad
        if (actual > m) {
            return;
        }

        // Imprimir el avance en la misma línea
        System.out.print("Avance: " + actual + "\r");

        // Dormir durante 1 segundo (1000 milisegundos)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Llamada recursiva con el siguiente número
        conteoProgresivoHasta(m, actual + 1);
    }

}