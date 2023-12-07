/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.0
 */

 /**
  * Animacion creada: Desplazar la figura a la derecha y regresar
           \|||/
           (> <)       
        ooO-(_)-Ooo 
  * @author Antony Cobos
  * @version 1.0
  */

public class Loading10 {

    public static void main(String[] args) {
        desplazarFigura();
    }

    public static void desplazarFigura() {
        // Número de espacios para desplazar la figura
        int desplazamiento = 0;
        String[] figura = {
                "   \\|||/",
                "  ( > < )",
                "ooO-(_)-Ooo"
        };

        int longitudPantalla = 30;  // Ajusta según la longitud de la pantalla o espacio disponible

        // Moverse de izquierda a derecha
        while (desplazamiento <= longitudPantalla) {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Imprimir espacios para el desplazamiento horizontal
            for (int i = 0; i < desplazamiento; i++) {
                System.out.print(" ");
            }

            // Imprimir la figura
            for (int i = 0; i < figura.length; i++) {
                // Imprimir espacios para el desplazamiento vertical
                if (i > 0) {
                    for (int j = 0; j < desplazamiento; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(figura[i]);
            }

            // Pausa para simular animación
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Retroceder al punto de partida (usando retorno de carro)
            for (int i = 0; i <= desplazamiento; i++) {
                System.out.print("\033[H\033[1A");
            }

            // Incrementar el desplazamiento
            desplazamiento++;
        }

        // Regresar de derecha a izquierda
        while (desplazamiento > 0) {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Imprimir espacios para el desplazamiento horizontal
            for (int i = 0; i < desplazamiento; i++) {
                System.out.print(" ");
            }

            // Imprimir la figura
            for (int i = 0; i < figura.length; i++) {
                // Imprimir espacios para el desplazamiento vertical
                if (i > 0) {
                    for (int j = 0; j < desplazamiento; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(figura[i]);
            }

            // Pausa para simular animación
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Retroceder al punto de partida (usando retorno de carro)
            for (int i = 0; i <= desplazamiento; i++) {
                System.out.print("\033[H\033[1A");
            }

            // Decrementar el desplazamiento
            desplazamiento--;
        }
    }
}
