/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class serie12 {

    public void verSerie12( int numTerminos){
        int terminoMostrar  = 3;
        for(int i = 0; i < numTerminos; i++){
            System.out.print( (i<numTerminos-1) ? terminoMostrar + ", " : terminoMostrar);
            terminoMostrar = terminoMostrar * 3;

            //Usando if:
           /*  if (i<numTerminos-1) {
                System.out.print( terminoMostrar + ", " );
            } else {
                System.out.println( terminoMostrar);
            } 
            terminoMostrar = terminoMostrar * 3;
            */
    }
}