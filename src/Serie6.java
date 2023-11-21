/*
 * Copyright (C) 2k23, andrea-m11
 * (GRUPO2), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class Serie6 {
    /**
     * <b>showSerie6For</b> Muestra la serie: 1, 4, 9, 16, 25, 36, 49, 64,.... usando for.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie6For (int numTerminos){
        for(int i = 1; i <= numTerminos; i++){
           System.out.print( (i<numTerminos) ? (i*i) + ", " : (i*i));
        }
        System.out.println(" ");

    }

    /**
     * <b>showSerie6While</b> Muestra la serie: 1, 4, 9, 16, 25, 36, 49, 64,.... usando while.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie6While (int numTerminos){
        int numeroSerie = 1;
        while (numeroSerie <= numTerminos) {
            System.out.print( (numeroSerie<numTerminos) ? (numeroSerie*numeroSerie) + ", " : (numeroSerie*numeroSerie));
            numeroSerie++;
        }
        System.out.println(" ");
    }

    /**
     * <b>showSerie6DoWhile</b> Muestra la serie: 1, 4, 9, 16, 25, 36, 49, 64,.... usando do while.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie6DoWhile (int numTerminos){
        int numeroSerie = 1;
        do {
            System.out.print( (numeroSerie<numTerminos) ? (numeroSerie*numeroSerie) + ", " : (numeroSerie*numeroSerie));         
        } while (numeroSerie++ < numTerminos);
        System.out.println(" ");
    }

     /**
     * <b>showSerie6Recursividad</b> Muestra la serie: 1, 4, 9, 16, 25, 36, 49, 64,.... usando recursividad.
     * @param numeroSerie : numero perteneciente a la serie.
     * @param numTerminos : cantidad de terminos a imprimir de la serie.
     */
    public void showSerie6Recursividad (int numeroSerie, int numTerminos){

       if (numTerminos==1) {
            System.out.println(numeroSerie*numeroSerie);
       } else {
            System.out.print( (numeroSerie*numeroSerie) + ", ");
            showSerie6Recursividad(numeroSerie+1, numTerminos-1);  
       }
    }
}
