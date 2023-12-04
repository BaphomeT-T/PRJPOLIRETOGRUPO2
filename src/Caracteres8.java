/**
 * Copyright (C) 2k23, lalabell-a
 * (NombreGrupo), ihavequestion29@gmail.com
 * version 1.0
 */

 /**
  * Serie 8: a  bbb  ccccc  ddddddd eeeeeeeee...
  * @author lalabell-a
  * @version 1.0
  */
public class Caracteres8 {

       /**
     * Usando For:
     * <b> showCaracter7For</b> muestra la serie: aa   bbbb  cccccc  dddddddd    ...
     * @param numCaracteres : numero de terminos. 
     */

    public void ShowCaracteres8For(int numCaracteres) {
        for (int i = 1; i <= numCaracteres; i++) {
            char letra = (char) ('a' + i-1);

            String strLetra = Character.toString(letra);

            int cantidad = i * 2 - 1;

            System.out.print(strLetra.repeat(cantidad));

            if (i != numCaracteres) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}