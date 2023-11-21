/*
 * Copyright (C) 2k23, JFranGar
 * (...), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class SerieNumerica12 {
   /**
    * b>showSerie12While</b> muestra la serie 12
    * @param numTerminos
    */
    public void showSerie12For(int numTerminos){
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print((i<numTerminos)?((i*i)+i)+",":(i*i)+i);
        }
        System.out.println(" ");
    }

    public void showSerie12While(int numTerminos){
        int i=0;
        while (i<numTerminos) {
            i++;
            System.out.print((i<numTerminos)?((i*i)+i)+",":(i*i)+i);
            
        }
        System.out.println("");
    }

    public void showSerie12DoWhile(int numTerminos){
        int i=1;
        do {
           System.out.print((i<numTerminos)?((i*i)+i)+",":(i*i)+i);
            i++;
        } while (i<numTerminos);
        System.out.println(" ");
    }
    
}