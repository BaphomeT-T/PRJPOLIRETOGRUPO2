/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

 public class Figuras6 {

/**
 * Imprime la figura 6 con el símbolo * en forma de triangulo.
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}