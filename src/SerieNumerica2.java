
/**
 * Copyright (C) 2k23,  Antony675
 * (JavaGenius), antony.cobos@epn.edu.ec
 * version 1.2
 */

 /**
  * Serie creada: 1 0 3 0 5 0 7 0 9 ... 
  * @author Antony Cobos
  * @version 1.2
  */
public class SerieNumerica2 {

    /**
     * Usando For:
     * <bd ShowSerie2For </b> muestra la serie: 1 0 3 0 5 0 7 0 9 ...

     * @param numTerminos : numero de terminos. 
     */

    public void ShowSerie2For(int numTerminos) {
        //System.out.print("->  ");

        for (int i = 1; i <= numTerminos; i++) {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }

        //System.out.println("\n\n");
    }


     /**
     * Usando While:
     * <b> ShowSerie2While </b> muestra la serie: 1 0 3 0 5 0 7 0 9 ...

     * @param numTerminos : numero de terminos. 
     */

    public void ShowSerie2While(int numTerminos) {
        //System.out.print("->  ");
        int i = 1;

        while (i <= numTerminos) {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        }

        //System.out.println("\n\n");
    }

    /**
     * Usando Dowhile:
     * <b> ShowSerie2Dowhile </b> muestra la serie: 1 0 3 0 5 0 7 0 9 ...

     * @param numTerminos : numero de terminos. 
     */

    public void ShowSerie2Dowhile(int numTerminos) {
        //System.out.print("->  ");
        int i = 1;

        do {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= numTerminos);

        //System.out.println("\n\n");
    }
}
