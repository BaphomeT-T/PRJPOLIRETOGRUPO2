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
public class Caracteres3 {
    /**
   * Usando For:
   * <b> showCaracter3For</b> muestra la serie: ++	 +++ +++++ +++++++ +++++++++++ +++++++++++++ ...
   * @param numCaracteres : numero de caracteres. 
   * @param numinit : numero inicial de la secuencia. 
   * */

public void ShowCaracteres3For (int numCaracteres){

for (int i = 0, numinit = 0; i < numCaracteres; numinit++) {
    if (Primo(numinit)) {
        System.out.print("+".repeat(numinit) + " ");
        i++;
    }
}
}

private static boolean Primo(int numinit) {
    if (numinit <= 1) {
        return false;
    }
    for (int j = 2; j <= Math.sqrt(numinit); j++) {
        if (numinit % j == 0) {
            return false;
        }
    }
    return true;
}

}
