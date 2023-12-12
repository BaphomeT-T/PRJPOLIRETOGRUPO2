/*
 * Copyright (C) 2k23, JFranGar
 * (JavaGenius), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class Loading7 {
    /**
     * Muestra el loanding7 
     */
   /**
     * Muestra el loanding7 
     */
    public void imprimirLoading7(){
        int longitudBarra = 20;
        int porcentaje = 0;

        while (porcentaje <= 100) {
            try {
                // Limpia la consola (puede no funcionar en todos los entornos)
                System.out.print("\033[H\033[2J");

                // Calcula el número de caracteres ocupados por la barra según el porcentaje
                int caracteresOcupados = (longitudBarra * porcentaje) / 100;

                // Calcula la posición del puntero rotacional
                int posicionRotacional = porcentaje % 4;

                // Dibuja la barra de progreso
                System.out.print("[");
                for (int i = 0; i < longitudBarra; i++) {
                    if (i < caracteresOcupados) {
                        System.out.print("=");
                    } else {
                        // Muestra el puntero rotacional
                        switch (posicionRotacional) {
                            case 0:
                                System.out.print("\\");
                                break;
                            case 1:
                                System.out.print("|");
                                break;
                            case 2:
                                System.out.print("/");
                                break;
                            case 3:
                                System.out.print("-");
                                break;
                        }
                    }
                }
                System.out.print("] " + porcentaje + "%");

                // Incrementa el porcentaje
                porcentaje++;

                // Duerme el hilo durante 100 milisegundos (ajusta según sea necesario)
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }