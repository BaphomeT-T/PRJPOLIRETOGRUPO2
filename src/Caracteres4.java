/**
 * Copyright (C) 2k23, lalabell-a
 * (NombreGrupo), ihavequestion29@gmail.com
 * version 1.0
 */

 /**
  * Serie 5: +  -  *  /  +  -  *  / +  -  *  /  ...
  * @author lalabell-a
  * @version 1.0
  */

public class Caracteres4 {
    /**
     * Usando For:
     * <b> showCaracter1For</b> muestra la serie: + - * / 
     * @param numCaracteres : numero de caracteres.
     * @param caracteres: lista de caracteres.
     */

  public void ShowCaracteres4For (int numCaracteres){
    String caracteres[] = {"+", "-", "*", "/"};
    for(int i=0; i < numCaracteres; i++){
        String c = caracteres[i%4];
    System.out.print(c + " "); 
  }
}
}