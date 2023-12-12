/*
 * Copyright (c),JfraGar
 * (javaGenius) jfchanatasig1405@gmail.com
 * version 1.0
 */
public class figura11 {
    /**
     * Imprime la figura 11 con un tamaño específico.
     *
     * @param tamano Tamaño de la figura 11 a imprimir.
     */
    public void imprimirFigura11(int tamano){
        // Bucle externo para iterar a través de las filas de la figura
        for (int i = 1; i <= tamano; i++) {
        // Imprime un carácter "|" al inicio de cada línea

            System.out.print("|");
        // Bucle interno para imprimir "_" en la cantidad correspondiente
        for (int k = 1; k <= i; k++) {

            System.out.print("_ ");
        }
        // Salta a la siguiente línea después de imprimir "_" y antes de espacios en blanco
        System.out.println();
        // Bucle interno para imprimir espacios en blanco después de imprimir "_"
        for (int j = 1; j <= tamano + i; j++) {
            System.out.print(" ");
        }
    }
    }
}
