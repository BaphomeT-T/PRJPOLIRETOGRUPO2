/*
 * Copyright (C) 2k23, BaphomeT-T
 * (JavaGenius), pdavila0113@gmail.com
 * Version 1.0
 */
public class Arrays3 {
    /**
      *  Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre
      * 
      * @param nombre Un string  del nombre
      */
    public void showArrays3 (String nombre){
        for (int i = nombre.length() ; i >= 0; i--) {
            StringBuilder lineasPlano = new StringBuilder();
            lineasPlano.append(i).append("|");
            if (i==0) {
                for(int j = 0; j<(nombre.length()*3); j++){
                    lineasPlano.append("_");
                }
                
            } else {
                for(int j = 0; j < (i*2) ; j++){
                lineasPlano.append(" ");
                }
                lineasPlano.append(nombre.charAt(i-1));
            }
         System.out.println(lineasPlano);

        }
        
    }
}
