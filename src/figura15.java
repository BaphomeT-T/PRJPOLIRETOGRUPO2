/*
 * Copyright (c),JfraGar
 * (javaGenius) jfchanatasig1405@gmail.com
 * version 1.0
 */
public class figura15 {
    /**
     * Imprime la figura 15 con un tamaño específico.
     *
     * @param tamano Tamaño de la figura 15 a imprimir.
     */
    public void imprimirFigura15(int tamano){
        for (int i = 0; i < tamano; i++) {
            // Imprimir números binomiales en cada fila
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "   ");
            }

           
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
    private static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}