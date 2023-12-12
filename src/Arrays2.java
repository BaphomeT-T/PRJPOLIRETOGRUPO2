/*
 * Copyright (C) 2k23, BaphomeT-T
 * (JavaGenius), pdavila0113@gmail.com
 * Version 1.0
 */
public class Arrays2 {
    /**
     * Crear una matriz solicitando el tamaño y caracter para almacenar la iniciales de su nombre y apellido y presentar la matriz
     * 
     * @param tamano Tamaño de matriz
     * @param caracter Caracter del que va a estar hecho el dibujo
     */
    public void showArrays2(int tamano, char caracter){
        char[][] matriz = new char[tamano][(tamano*2)+1];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < (tamano*2)+1; j++) {
                if (j == 0 || (i == 0 && j!= tamano && j != (tamano*2)) || (i == (int)(tamano / 2) && j< tamano) || (j == tamano-1 && i<(int)(tamano/2)) || j==tamano+1 || (i == tamano-1 && j > (tamano) && j<(tamano*2) ) ||(j==(tamano*2) && i!=0 && i!= tamano-1) ) {
                    matriz[i][j] = caracter;
                } else {
                    matriz[i][j] = ' ';
                }
            }
    
        }
        mostrarMatrizFigura(matriz);
    }
    private void mostrarMatrizFigura(char[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < (matriz[0].length); j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
