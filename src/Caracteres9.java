/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

public class Caracteres9 {

/**
 * Imprime la serie de caracteres 9 con las letras del abecedario, las primeras tres se presentan una
 * sola vez y las demas se presentan.
 * 
 * @param numCaracteres corresponde a la cantidad de caracteres a presentar. 
 */
    public void showCaracteres9(int n) {
        for (int i = 0; i < n; i++) {
            int repeticiones = 1;
            if (i >= 3) {
                int a = 1;
                int b = 1;
                int k = 3;
                while (k <= i) {
                    int temp = a + b;
                    a = b;
                    b = temp;
                    k++;
                }
                repeticiones = b;
                System.out.print(" ");
            }
            for (int j = 0; j < repeticiones; j++) {
                System.out.print((char) ('a' + i));
                if(i<2){
                    System.out.print(" ");
                }
            }
        }
    }
}