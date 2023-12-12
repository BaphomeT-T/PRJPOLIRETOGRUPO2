/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

 public class Figuras7 {

/**
 * Imprime la figura 7 con los símbolos | y _ en forma de escalera (arriba hacia abajo).
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            System.out.println("|___");
        }
    }
}