/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class CadenaCaracteres1 {
    
    /**
     * 	Pide una frase y cuenta las vocales.
     * @param frase la cadena de caracteres original, de la cual se
     * contarán las vocales.
     */
    public void showCadenaCaracteres1(String frase) {
        int vocales = 0;
        char[] arregloVocales = {'a','e','i','o','u'};
		for (int i = 0; i < frase.length(); i++) {     
            for (int j = 0; j < arregloVocales.length; j++) {
                if (frase.charAt(i) == arregloVocales[j]) {
                    vocales++;  
                }
            }
		}
	    System.out.println("Hay: " + vocales + " vocales");
        System.out.println(" ");
    }

}
