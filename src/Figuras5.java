/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

 public class Figuras5 {

/**
 * Imprime la figura 5 con el símbolo * en forma de triangulo invertido.
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura5(int n) {
        for (int i = n; i >= 1; i--) {
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