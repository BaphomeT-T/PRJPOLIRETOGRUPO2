/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

public class Figuras1 {

/**
 * Imprime la figura 1 con el símbolo * en forma de cuadrado.
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura1(int n) {
      for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                 System.out.print("* ");
                } else {
                 System.out.print("  ");
                }
            }
         System.out.println();
        }
    }
}