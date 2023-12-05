/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Loading creada: Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100% 
		Ejemplo: Patricio Paccha
          t                 15%
		 	r				20%
		        o       	50%
		               a    100%
  * @author Antony Cobos
  * @version 1.0
  */

public class Loading9 {

    public static void mostrarNombrePorcentaje(String nombreCompleto) {
        int longitud = nombreCompleto.length();

        for (int i = 0; i < longitud; i++) {
            int porcentaje = ((i + 1) * 100) / longitud;

            System.out.print("[");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(nombreCompleto.charAt(i));

            // Espacios adicionales para ajustar dinámicamente la longitud de la barra de carga
            for (int k = i + 1; k < longitud; k++) {
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

    public static void main(String[] args) {
        // Ejemplo de uso
        mostrarNombrePorcentaje("Loading9");
    }
}
