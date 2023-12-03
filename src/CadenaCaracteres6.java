/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 2.0
 */
public class CadenaCaracteres6 {
    /**
     * Pedir una frase y presentarla inverida con las consonantes en mayusculas. 
     *
     * @param palabraOriginal The original string that needs to be inverted.
     */
    public void showCadenaCaracteres6(String palabraOriginal) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = palabraOriginal.length() - 1; i >= 0; i--) {
            char c = palabraOriginal.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                palabraInvertida.append(c);
            } else {
                palabraInvertida.append(Character.toUpperCase(c));
            }
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }
}