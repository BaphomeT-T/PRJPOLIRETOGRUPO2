/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

 public class Figuras3 {

/**
 * Imprime la figura 3 con el símbolo * en forma de escalera (arriba hacia abajo).
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}