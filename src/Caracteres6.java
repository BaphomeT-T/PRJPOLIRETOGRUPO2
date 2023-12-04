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

public class Caracteres6 {
    /**
     * Usando For:
     * <b> showCaracter6For</b> muestra la serie: a  b   c   d   e   f   g   h   ...
     * @param numCaracteres : numero de caracteres. 
     * @param caracter : alfabeto. 
     */

  public void ShowCaracteres6For (int numCaracteres){
    for(int i=0; i < numCaracteres; i++){
    char caracter = (char)(i+ 'a');
    System.out.print(caracter + " "); 
  }
}
}
