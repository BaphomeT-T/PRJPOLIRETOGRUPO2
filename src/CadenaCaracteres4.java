/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class CadenaCaracteres4 {


    public void showCadenaCaracteres4(String frase, char letra) {

        char[] arregloFrase = frase.toCharArray();
        for (int i = 0; i < arregloFrase.length; i++) {
            if (arregloFrase[i] == (letra)) {
                arregloFrase[i] = ' ';
            }
        }
        String fraseSinLetra = new String(arregloFrase);  
        System.out.println("\nCadena sin la letra " + letra + ": " + fraseSinLetra);
        System.out.println(" ");


        // Con la función replaceAll:
        /*   
        String fraseSinLet = "";
        fraseSinLet = frase.replaceAll(letra, " "); 
        System.out.println("Cadena sin la letra " + letra + ": " + fraseSinLet);
        */
    }

}
