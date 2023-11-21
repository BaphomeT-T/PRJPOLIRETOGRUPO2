/*
 * Copyright (C) 2k23, andrea-m11
 * (GRUPO2), andreachicaiza11@gmail.com
 * Version 2.0
 */

public class SerieNumerica7 {
    /**
     * <b>showSerie7For</b> Muestra la serie: 1, 4, 7, 10, 13, 16, 19, 22, 25,... usando for.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie7For (int numTerminos){
        
        for(int i = 1; i <= numTerminos; i++){
            System.out.print( (i<numTerminos) ? (3*i-2) + ", " : (3*i-2));
        }

        System.out.println("");

        /* Opción 2:
        int numeroSerie = 1;
        for (int i = 0; i < numTerminos; i++) {
            System.out.print( (i<numTerminos-1) ? numeroSerie + ", " : numeroSerie);
            numeroSerie = numeroSerie + 3;
        }
        System.out.println("");
        */

    }

    /**
     * <b>showSerie7While</b> muestra la serie: 1, 4, 7, 10, 13, 16, 19, 22, 25,... usando while.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie7While (int numTerminos){
        int numeroSerie = 1;
        while (numeroSerie <= numTerminos*3-2) {
            System.out.print( (numeroSerie < numTerminos*3-2) ? numeroSerie + ", " : numeroSerie);
            numeroSerie+=3;
        }
        System.out.println("");
    }

    /**
     * <b>showSerie7DoWhile</b> muestra la serie: 1, 4, 7, 10, 13, 16, 19, 22, 25,... usando do while.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie7DoWhile (int numTerminos){
        int numeroSerie = 1;
        do {
            System.out.print( (numeroSerie < numTerminos*3-2) ? numeroSerie + ", " : numeroSerie);        
        } while ((numeroSerie+=3) <= numTerminos*3-2);
        System.out.println("");
    }

     /**
     * <b>showSerie7Recursividad</b> muestra la serie: 1, 4, 7, 10, 13, 16, 19, 22, 25,...usando recursividad.
     * @param numeroSerie : numero perteneciente a la serie.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie7Recursividad (int numeroSerie, int numTerminos){

       if (numTerminos==1) {
            System.out.println(numeroSerie);
       } else {
            System.out.print(numeroSerie + ", ");
            showSerie7Recursividad(numeroSerie+3, numTerminos-1);  
       }
    }
}