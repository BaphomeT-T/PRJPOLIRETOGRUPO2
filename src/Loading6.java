/*
 * Copyright (C) 2k23, JFranGar
 * (JavaGenius), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class Loading6 {
    public void imprimirLoading6(){
        int longitudBarra = 20;
        int porcentaje = 0;

        while (porcentaje <= 100) {
            try {

                // Calcula el número de caracteres ocupados por la barra según el porcentaje
                int caracteresOcupados = (int) Math.ceil((longitudBarra * porcentaje) / 100.0);

                // Dibuja la barra de progreso
                System.out.print("[");
                for (int i = 0; i < longitudBarra; i++) {
                    if (i < caracteresOcupados) {
                        System.out.print("=");
                    } else {
                        System.out.print(" ");
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
