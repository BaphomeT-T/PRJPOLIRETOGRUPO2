/**
 * Copyright (C) 2k23,  Antony675
 * (...), antony.cobos@epn.edu.ec
 * version 1.1
 */

 /**
  * Serie creada: 0 1 1 2 3 5 8 13 ... 
  * @author Antony Cobos
  * @version 1.1
  */

public class SerieNumerica1 {

    /**
     * Usando For:
     * <b> ShowSerie1For </b> muestra la serie: 0 1 1 2 3 5 8 13 ...

     * @param numTerminos : numero de terminos. 
     */

    public void ShowSerie1For(int numTerminos) {
        System.out.print("->  ");
        int a = 1, b = 0, c = 0;

        for (int i = 0; i < numTerminos; i++) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\n\n");
    }

    /**
     * Usando While:
     * <b> ShowSerie1While </b> muestra la serie: 0 1 1 2 3 5 8 13 ...

     * @param numTerminos : numero de terminos. 
     */

    public void ShowSerie1While(int numTerminos) {
        System.out.print("->  ");
        int a = 1, b = 0, c = 0;
        int i = 0;

        while (i < numTerminos) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println("\n\n");
    }

    /**
     * Usando Dowhile:
     * <b> ShowSerie1Dowhile </b> muestra la serie: 0 1 1 2 3 5 8 13 ...

     * @param numTerminos : numero de terminos. 
     */
    public void ShowSerie1Dowhile(int numTerminos) {
        System.out.print("->  ");
        int a = 1, b = 0, c = 0;
        int i = 0;

        do {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < numTerminos);

        System.out.println("\n\n");
    }
}