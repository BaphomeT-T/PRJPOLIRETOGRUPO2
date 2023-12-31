/**
 * Copyright (C) 2k23, lalabell-a
 * (JavaGenius), ihavequestion29@gmail.com
 * version 1.0
 */

 /**
  * Serie creada: *2, *2, *2, *2
  * @author lalabell-a
  * @version 1.0
  */


public class SerieNumerica9 {
    /**
     * Usando For:
     * <b> showserie9For</b> muestra la serie: 2,4,8,16
     * @param numTerminos : numero de terminos. 
     * @param termino : termino inicial.
     */

     /*public void showserie9For (int numTerminos){
        int termino = 2;
        for (int i = 0; i < numTerminos; i++){
            System.out.print( (i<numTerminos-1) ? termino + ", " : termino);
        }
     }*/

    /**
     * Usando For:
     * <b> showserie9For</b> muestra la serie: 2,4,8,16
     * @param NumTerminos : numero de terminos. 
     * @param termino : termino inicial.
     */

      public void showserie9For (int NumTerminos){
        int termino = 2;
        for (int i = 0; i < NumTerminos; i++){
            System.out.print( (i<NumTerminos-1) ? termino + ", " : termino);

            termino = termino *2; 
        }
        System.out.println("");
    }

    /**
     * Usando While:

     * @param numTerminos : numero de terminos.
     * @param termino : termino inicial.
     */
    public void showserie9while (int numTerminos){
        int termino =2;
        while(numTerminos > 0){
            System.out.print( (numTerminos!=1) ? termino + ", " : termino);
            termino = termino *2;
            numTerminos--; 
        }
    }

     /* @param NumTerminos : numero de terminos.
     * @param termino : termino inicial.
     */
    /*public void showserie9while (int NumTerminos){
        int termino =2;
        while(NumTerminos > 0){
            System.out.print( (NumTerminos!=1) ? termino + ", " : termino);
            termino = termino *2;
            NumTerminos--; 

        }
            System.out.println("");
        }*/

    /**
     * Usando Do-While:
     * @param numTerminos : numero de terminos
     * @param termino : termino inicial.
     */
    public void showserie9dowhile (int numTerminos){
        int termino =2;
        do {
            System.out.print( (numTerminos!=1) ? termino + ", " : termino);
            termino = termino *2;
            numTerminos--; 
        }while(numTerminos != 0);
    }


     /* @param NumTerminos : numero de terminos
     * @param termino : termino inicial.
     */
    /*public void showserie9dowhile (int NumTerminos){
        int termino =2;
        do {
            System.out.print( (NumTerminos!=1) ? termino + ", " : termino);
            termino = termino *2;
            NumTerminos--; 
        }
        while(NumTerminos != 0);
            System.out.println("");
    }*/
}
