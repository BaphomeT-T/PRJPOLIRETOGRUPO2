/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 3.0
 */
public class CadenaCaracteres9 {
    private StringBuilder palabraAlterada= new StringBuilder();

    /**
     * Ingresa una frase y convertir una leta a mayusculas y otra a minisculas

     * 
     * @param palabraOriginal Palabra Original
     */
    public void showCadenaCaracteres9(String palabraOriginal){
        
        StringBuilder palabraAlterada = new StringBuilder();

        for (int i=0;i<palabraOriginal.length();i++) {
            char c = palabraOriginal.charAt(i);
        
            if (i%2 == 0) {
               palabraAlterada.append(Character.toUpperCase(c));

            } else {
                palabraAlterada.append(Character.toLowerCase(c));

            }
        }
    
        System.out.println("Palabra alterada: " + palabraAlterada);
    }
}
