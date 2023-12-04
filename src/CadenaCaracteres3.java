/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class CadenaCaracteres3 {

    /**
     * Pide una frase y una vocal, y elimina la vocal ingresada de la frase.
     * @param frase la cadena de caracteres original, de la cual se
     * eliminará la vocal.
     * @param vocal el caracter que se eliminará la cadena.
     */
    public void showCadenaCaracteres3(String frase, char vocal) {

        char[] arregloFrase = frase.toCharArray();
        for (int i = 0; i < arregloFrase.length-1; i++) {
            if (arregloFrase[i] == (vocal)) {
                arregloFrase[i] = ' ';
            }
        }
        String fraseSinVocal = new String(arregloFrase);  
        System.out.println("Cadena sin la vocal " + vocal + ": " + fraseSinVocal);


        // Con la función replaceAll:
        /*     
        String fraseSinVoc = "";
        fraseSinVoc = frase.replaceAll(vocal, " "); 
        System.out.println("Cadena sin la vocal " + vocal + ": " + fraseSinVoc);
        */



        //Para eliminar todas las vocales:
        /* 
        char[] arregloVocales = {'a','e','i','o','u'};
        char[] arregloFrase = frase.toCharArray();
        for (int i = 0; i < arregloFrase.length-1; i++) {
            for (int j = 0; j < arregloVocales.length-1; j++) {
                if (arregloFrase[i] == arregloVocales[j]) {
                    arregloFrase[i] = ' ';
                }
            }
        }
        String fraseSinVocales = new String(arregloFrase);  
        System.out.println(fraseSinVocales);
        */

    }


}
