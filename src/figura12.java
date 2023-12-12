/*
 * Copyright (c),JfraGar
 * (javaGenius) jfchanatasig1405@gmail.com
 * version 1.0
 */
public class figura12 {
    /**
     * Imprime la figura 12 con un tamaño específico.
     *
     * @param tamano Tamaño de la figura 12 a imprimir.
     */
    public void imprimirFigura12(int tamano){
        // Bucle externo para iterar desde el tamaño hasta 1
        for (int i = tamano; i >= 1; i--) {
            // Bucle interno para imprimir números del 1 al i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Salto de línea después de imprimir los números
            System.out.println();
        }
    }
}
