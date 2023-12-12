/*
 * Copyright (c),JfraGar
 * (javaGenius) jfchanatasig1405@gmail.com
 * version 1.0
 */
public class figura9 {
     /**
     * Imprime la figura 9 con un tamaño específico.
     *
     * @param tamano Tamaño de la figura 9 a imprimir.
     */
    public void imprimirFigura9(int tamano){
         // Bucle externo para iterar a través de las filas de la figura
        for (int i = 0; i < tamano; i++) {
            // Espacios en blanco antes de imprimir la primera parte de la figura
            for (int j = 0; j < 4 * (tamano - i - 1); j++) {
                System.out.print(" ");
            }
            // Imprime la primera parte de la figura

            System.out.print(" ___|");
            // Espacios en blanco entre las dos partes de la figura

            for (int j = 0; j < 8 * i; j++) {
                System.out.print(" ");
            }
            // Imprime la segunda parte de la figura y pasa a la siguiente línea
            
            System.out.println("|___");
        }

    }
}
