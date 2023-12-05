/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

 public class Figuras4 {

/**
 * Imprime la figura 4 con el símbolo * en forma de escalera (abajo hacia arriba).
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}