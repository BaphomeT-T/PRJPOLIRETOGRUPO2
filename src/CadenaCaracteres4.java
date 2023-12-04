/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class CadenaCaracteres4 {


    public void showCadenaCaracteres4(String frase, char letra) {

        char[] arregloFrase = frase.toCharArray();
        for (int i = 0; i < arregloFrase.length-1; i++) {
            if (arregloFrase[i] == (letra)) {
                arregloFrase[i] = ' ';
            }
        }
        String fraseSinLetra = new String(arregloFrase);  
        System.out.println("Cadena sin la letra " + letra + ": " + fraseSinLetra);


        // Con la función replaceAll:
        /*   
        String fraseSinLet = "";
        fraseSinLet = frase.replaceAll(letra, " "); 
        System.out.println("Cadena sin la letra " + letra + ": " + fraseSinLet);
        */
    }

}
