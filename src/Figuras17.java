/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class Figuras17 {

/**
 * Imprime la figura 17 con números 1 y 0 en forma de X.
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura17(int tamano) {
        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= tamano; j++) {
                if ((i == j || i + j == tamano + 1)) {
                    if (i%2==0) {
                        System.out.print(" "+ '0' +" ");
                    } else {
                        System.out.print(" " + '1' + " ");
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
