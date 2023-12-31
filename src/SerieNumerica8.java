/**
 * Copyright (C) 2k23, lalabell-a
 * (JavaGenius), ihavequestion29@gmail.com
 * version 1.0
 */

 /**
  * Serie creada: +5, +5, +5, +5
  * @author lalabell-a
  * @version 1.0
  */

  public class SerieNumerica8 {

    /**
     * Usando For:
     * <b> showserie8For</b> muestra la serie: 3,8,13,18

     * @param numTerminos : numero de terminos. 
     * @param termino : termino inicial.
     */

    /*public void showserie8For (int numTerminos){
        int termino = 3;
        for (int i = 0; i < numTerminos; i++){
            System.out.print( (i<numTerminos-1) ? termino + ", " : termino);
        }
    }*/
     /* @param NumTerminos : numero de terminos. 
     * @param termino : termino inicial.
     */

    public void showserie8For (int NumTerminos){
        int termino = 3;
        for (int i = 0; i < NumTerminos; i++){
            System.out.print( (i<NumTerminos-1) ? termino + ", " : termino);

            termino = termino +5; 
        }
        System.out.println("");
    }

    /**
     * Usando While:
     * @param numTerminos : numero de terminos.
     * @param termino : termino inicial.
     */
    public void showserie8while (int numTerminos){
        int termino =3;
        while(numTerminos > 0){
            System.out.print( (numTerminos!=1) ? termino + ", " : termino);
            termino = termino +5;
            numTerminos-- ; 
        }
    }

     /* @param NumTerminos : numero de terminos.
     * @param termino : termino inicial.
     */
   /* public void showserie8while (int NumTerminos){
        int termino =3;
        while(NumTerminos > 0){
            System.out.print( (NumTerminos!=1) ? termino + ", " : termino);
            termino = termino +5;
            NumTerminos--; 

        }
            System.out.println("");
        }*/ 

    /**
     * Usando Do-While:
     * @param numTerminos : numero de terminos.
     * @param termino : termino inicial.
     */
    public void showserie8dowhile (int numTerminos){
        int termino =3;
        do {
            System.out.print( (numTerminos!=1) ? termino + ", " : termino);
            termino = termino +5;
            numTerminos--; 
        }while(numTerminos != 0);
    }

     /* @param NumTerminos : numero de terminos.
     * @param termino : termino inicial.
     */
   /*  public void showserie8dowhile (int NumTerminos){
        int termino =3;
        do {
            System.out.print( (NumTerminos!=1) ? termino + ", " : termino);
            termino = termino +5;
            NumTerminos--; 
        }
        while(NumTerminos != 0);
            System.out.println("");
    }*/
  }
  