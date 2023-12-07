/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class Figuras16 {

/**
 * Imprime la figura 16 con símbolos + y - en forma de X.
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura16(int tamano) {
        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= tamano; j++) {
                if ((i == j || i + j == tamano + 1)) {
                    if (i%2==0) {
                        System.out.print(" "+ '-' +" ");
                    } else {
                        System.out.print(" " + '+' + " ");
                    } 
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }


}
