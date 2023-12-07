/*
 * Copyright (C) 2k23, andrea-m11
 * (JavaGenius), andreachicaiza11@gmail.com
 * Version 1.0
 */

public class CadenaCaracteres2 {

    /**
     * 	Pide una frase y cuenta las consonantes.
     * @param frase la cadena de caracteres original, de la cual se
     * contarán las consonantes.
     */
    public void showCadenaCaracteres2(String frase) {

        int consonantes = frase.trim().length();
        char[] arregloVocales = {'a','e','i','o','u'};

		for (int i = 0; i < frase.trim().length(); i++) {     
            for (int j = 0; j < arregloVocales.length; j++) {
                if (frase.trim().charAt(i) == arregloVocales[j]) {
                    consonantes--;
                }
            }
		}
	    System.out.println("Hay: " + consonantes + " consonantes");
        System.out.println(" ");
    }

}
