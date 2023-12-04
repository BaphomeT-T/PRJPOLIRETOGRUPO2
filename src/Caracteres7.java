/**
 * Copyright (C) 2k23, lalabell-a
 * (NombreGrupo), ihavequestion29@gmail.com
 * version 1.0
 */

 /**
  * Serie 6: a  b   c   d   e   f   g   h   ...
  * @author lalabell-a
  * @version 1.0
  */

public class Caracteres7 {
    /**
     * Usando For:
     * <b> showCaracter7For</b> muestra la serie: aa   bbbb  cccccc  dddddddd    ...
     * @param numCaracteres : numero de terminos. 
     */


public void ShowCaracteres7For(int numCaracteres) {
    for (int i = 1; i <= numCaracteres; i++) { // Changed starting value here
        char letra = (char) ('a' + i-1);
        String strLetra = Character.toString(letra);
        int cantidad = i * 2;
        System.out.print(strLetra.repeat(cantidad));
        if (i != numCaracteres) {
            System.out.print(" ");
        }
    }
    System.out.println();
}
}
