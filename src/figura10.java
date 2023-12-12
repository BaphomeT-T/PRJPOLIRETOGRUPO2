/*
 * Copyright (c),JfraGar
 * (javaGenius) jfchanatasig1405@gmail.com
 * version 1.0
 */
public class figura10 {
    /**
     * Imprime la figura 10 con un tamaño específico.
     *
     * @param tamano Tamaño de la figura 10 a imprimir.
     */
    public void imprimirFigura10(int tamano){
        // Bucle externo para iterar a través de las filas de la figura

        for (int i = 0; i < tamano; i++) {
            // Espacios en blanco antes de la primera línea de la figura
            for (int j = 0; j < 5 * i; j++) {
                System.out.print(" ");
            }
            // Imprime la primera línea de la figura
            System.out.println((i==0)?"_+_":"|_+_");
            // Espacios en blanco antes de la segunda línea de la figura
            
            for (int j = 0; j < 5 * i; j++) {
                System.out.print(" ");
            }
            // Imprime la segunda línea de la figura y pasa a la siguiente línea
            System.out.println("  |_-_");
        }
    }
}

