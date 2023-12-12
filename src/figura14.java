/*
 * Copyright (c),JfraGar
 * (javaGenius) jfchanatasig1405@gmail.com
 * version 1.0
 */
public class figura14 {
    /**
     * Imprime la figura 14 con un tamaño específico.
     *
     * @param tamano Tamaño de la figura 14 a imprimir.
     */
    public void imprimirFigura14(int tamano){
        for (int i = 0; i < tamano; i++) {
            // Imprimir espacios en blanco antes de los números
            for (int j = 0; j < tamano - i; j++) {
                System.out.print("  ");
            }

            // Imprimir números en cada fila
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "    ");
            }

            // Nueva línea para el siguiente nivel
            System.out.println();
        }
        
    }
    /**
     * Calcula el coeficiente binomial C(n, k) de forma recursiva.
     *
     * @param n Valor total.
     * @param k Valor de elección.
     * @return Coeficiente binomial C(n, k).
     */
    private int binomialCoefficient(int n, int k) {
            if (k == 0 || k == n) {
                return 1;
            } else {
                return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
            }

        }
}

