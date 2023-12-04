/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class Figuras19 {

/**
 * Imprime la figura 19 con números y símbolos * y +, en forma de triangulo rectángulo.
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura19(int tamano) {

        for (int i=1; i<=tamano; i++){
            if (i>1) {
                System.out.print("+  ");
            }
            for (int j=i; j>2; j--){
                if (j==4) {
                    System.out.print((int) Math.pow(i-2, 2) + "  ");
                }else if (j==5) {
                   System.out.print((int) Math.pow(i-2, 2)-(j-1) + "  ");
                } else {
                    System.out.print((2*i-j) + "  ");
                }
            }
            System.out.println("*");
        }
        System.out.println(" ");
    }
}
