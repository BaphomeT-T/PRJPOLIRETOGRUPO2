/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Loading creada: Pedir el nombre y apellidos y realizar la carga mostrando letra a letra hasta el 100% 
        [Patricio            ] 50%
  * @author Antony Cobos
  * @version 1.0
  */

public class Loading8 {


    public static void mostrarNombrePorcentaje(String nombreCompleto) {
        int longitud = nombreCompleto.length();

        for (int i = 0; i <= longitud; i++) {
            int porcentaje = (i * 100) / longitud;

            System.out.print("[");
            for (int j = 0; j < i; j++) {
                System.out.print(nombreCompleto.charAt(j));
            }

            // Espacios adicionales para ajustar dinámicamente la longitud de la barra de carga
            for (int k = 0; k < longitud - i; k++) {
                System.out.print(" ");
            }

            System.out.print("] " + porcentaje + "%");

            // Limpiar la línea anterior en la consola
            System.out.print("\r");

            try {
                // Pausa para simular la animación
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(); // Salto de línea al final
    }
}
