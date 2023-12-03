/**
 * Copyright (C) 2k23, lalabell-a
 * (NombreGrupo), ihavequestion29@gmail.com
 * version 1.0
 */

 /**
  * Serie 1:  + - + - + - + ...
  * @author lalabell-a
  * @version 1.0
  */

public class Caracteres1 {

      /**
     * Usando For:
     * <b> showCaracter1For</b> muestra la serie: +,-,+,-
     * @param numCaracteres : numero de caracteres. 

     * */

  public void ShowCaracteres1For (int numCaracteres){
    for(int i=0; i < numCaracteres; i++)
    System.out.print((i % 2 == 0) ? " +" : " -"); 
  }

 /*  
     * Usando While:
     * @param numCaracteres : numero de caracteres.
     
  public void ShowCaracteres1While (int numCaracteres){
    int i = 0;
        while (++i < numCaracteres+1) {
            System.out.print((i % 2 == 0) ? " -" : " +");
        }

  }*/



    /*
     * Usando Do-While:
     * @param numCaracteres : numero de caracteres
     
    public void ShowCaracteres1DoWhile (int numCaracteres){
      int i = 0;
      do{
        System.out.print( (i % 2 == 0) ? " +" : " -");
      } while (++i < numCaracteres);
    }*/

}
