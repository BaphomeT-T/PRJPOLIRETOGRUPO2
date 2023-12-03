/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 1.0
 */
public class Arrays1 {
    /**
     * Crear una array para cada palabra de su nombre e ingrese el porcentaje de carga para cada palabra.
     *
     * @param nombreCompleto Arreglo que contiene el nombre completo de un indiviiduo
     * @param porcentajes Arreglo que contiene el porcentaje para cada nombre de un individuo
     */
    public void showArrays1(String[] nombreCompleto, int[] porcentajes){
        for (int i=0 ; i<nombreCompleto.length;i++) {
            StringBuilder barra = new StringBuilder("[");
            int tamañoBarra = (int)(porcentajes[i]/5);
            for(int j = 0; j<tamañoBarra; j++){
                barra.append("=");
            }
            barra.append(">");
            for(int j = tamañoBarra; j<20; j++){
                barra.append(" ");
            }
            int fin = (int)((porcentajes[i]/10));
            barra.append("] ").append(porcentajes[i]).append("% ").append(nombreCompleto[i].substring(0, ((fin>nombreCompleto[i].length()) ? nombreCompleto[i].length(): fin )));
            System.out.println(barra);
        }
    }
}
