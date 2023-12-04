/**
 * Copyright (C) 2k23, lalabell-a
 * (NombreGrupo), ihavequestion29@gmail.com
 * version 1.0
 */

 /**
  * Serie2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
  * @author lalabell-a
  * @version 1.0
  */

public class Caracteres2 {

    /**
   * Usando While:
   * <b> showCaracter2While</b> muestra la serie: + + ++ +++ +++++ ++++++++ +++++++++++++ ...
   * @param numCaracteres : numero de caracteres. 

   * */

public void ShowCaracteres2While (int numCaracteres){
    int i=0, num1 = 1, num2 = 0, total = 0;
    while (i++ < numCaracteres) {
        total= num1 + num2;
        num1 = num2;
        num2 = total;
        System.out.print("+".repeat(total) + " ");
    }
    }
}
