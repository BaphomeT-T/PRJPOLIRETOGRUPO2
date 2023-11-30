/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 3.0
 */
public class CadenaCaracteres5 {
    /**
     * Invierte una frase y cambbia sus vocales por mayúsculas
     * 
     * @param palabraOriginal The original string to be reversed and have its vowels converted to uppercase.
     * @return The reversed string with uppercase vowels.
     */
    public void showCadenaCaracteres5(String palabraOriginal) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = palabraOriginal.length() - 1; i >= 0; i--) {
            char c = palabraOriginal.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                palabraInvertida.append(Character.toUpperCase(c));
            } else {
                palabraInvertida.append(c);
            }
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }
   
}
