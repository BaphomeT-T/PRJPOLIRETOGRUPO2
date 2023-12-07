/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class Figuras18 {

/**
 * Imprime la figura 18 con números en forma de triangulo rectángulo.
 * 
 * @param tamano corresponde a los niveles que tendrá la figura.
 */
    public void showFigura18(int tamano) {
        int contador= 1;
        int [][] matrizSerie = new int[tamano-1][tamano];
        for (int filas = 0; filas < tamano; filas++) {
            System.out.println(2);
            System.out.print( (filas< tamano-1) ? 1 + "  " : "");
            for (int columnas = 0; columnas < tamano; columnas++) {        
                if (filas < tamano-2 && columnas == 0) {
                    matrizSerie[filas+1][columnas] = filas+3;
                    contador -=1;
                } 
                if (filas < tamano-2 && columnas !=0 && columnas == filas) {
                    matrizSerie[filas+1][columnas] = (2*matrizSerie[filas+1][0]-3);
                    contador -=1;
                }  
                if (filas < tamano-2 && contador > 0 && columnas !=0 && columnas != filas) {
                    matrizSerie[filas+1][columnas] = matrizSerie[filas][columnas] + matrizSerie[filas][columnas-1];
                    contador -=1;
                }                
                if (filas < tamano-1 && matrizSerie[filas][columnas]!= 0) {
                   System.out.print(matrizSerie[filas][columnas] + "  "); 
                }
            }
            contador = filas+1;
        }
    }
}
