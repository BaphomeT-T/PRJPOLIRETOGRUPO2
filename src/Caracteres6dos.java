/**
 * Copyright (C) 2k23, lalabell-a
 * (NombreGrupo), ihavequestion29@gmail.com
 * version 1.0
 */


/**
  * Serie 6: a  +   c   -   e   +   g   -   ...
  * @author lalabell-a
  * @version 1.0
  */
public class Caracteres6dos {

    /**
     * Usando For:
     * <b> showCaracter6For</b> muestra la serie: a  b   c   d   e   f   g   h   ...
     * @param numCaracteres : numero de caracteres. 
     * @param caracter : alfabeto. 
     */

    public void ShowCaracteres6dosFor(int numCaracteres) {
        for (int i = 0; i < (numCaracteres/2); i++) {
            char caracter = (char) ('a' + i * 2);
            System.out.print(caracter + " ");

            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
    }
}

 


