/*
 * Copyright (C) 2k23, JFranGar
 * (JavaGenius), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class Loading5 {
    public void imprimprimirLoading5(){

        int totalCaracteres = 20;
        int porcentaje = 0;

        while (porcentaje <= 100) {
            // Calcula la cantidad de caracteres llenos en la barra
            int caracteresLlenos = (int) (totalCaracteres * porcentaje / 100.0);

            // Imprime la barra de progreso
            System.out.print("[");

            for (int i = 0; i < totalCaracteres; i++) {
                if (i < caracteresLlenos) {
                    // Caracter lleno
                    System.out.print("=");
                } else if (i == caracteresLlenos) {
                    // Puntero
                    System.out.print(">");
                } else {
                    // Caracter vacío
                    System.out.print("-");
                }
            }

            System.out.print("] " + porcentaje + "%");

            // Incrementa el porcentaje para la próxima iteración
            porcentaje += 10;

            try {
                // Introduce un retraso de 500 milisegundos (0.5 segundos)
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Borra la línea actual para actualizar la barra de progreso
            System.out.print("\r");
        }
    }
    }