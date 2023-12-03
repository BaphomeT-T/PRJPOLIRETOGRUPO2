/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 1.0
 */
public class CadenaCaracteres7 {
    /**
     * Pedir una frase y presentarla en mayusculas y sin la J
     *
     * @param palabraOrigial The original string that needs to be modified.
     */
    public void showCadenaCaracteres7(String palabraOrigial){
        palabraOrigial = palabraOrigial.toUpperCase();
        StringBuilder palabraAlterada = new StringBuilder();
        for(int i=0;i<palabraOrigial.length();i++){
            if(palabraOrigial.charAt(i)!= 'J'){
                palabraAlterada.append(palabraOrigial.charAt(i));
            }
        }
        System.out.println("Palabras sin J y Mayúsculas: "+palabraAlterada);
    }
}
