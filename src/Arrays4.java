/*
 * Copyright (C) 2k23, BaphomeT-T
 * (JavaGenius), pdavila0113@gmail.com
 * Version 1.0
 */
public class Arrays4 {
    /**
     * This method takes two strings as input, `nombre` and `apellido`, and creates a matrix of characters based on the lengths of these strings.
     * The matrix is then filled with characters from the input strings in a specific pattern.
     * Finally, the matrix is printed.
     *
     * @param nombre (String): The first name.
     * @param apellido (String): The last name.
     */
    public void showArrays4(String nombre, String apellido) {
        int longitudMaxima = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[2 * longitudMaxima - 1][2 * longitudMaxima - 1];

        for (int i = 0; i < longitudMaxima; i++) {
            if(i >= nombre.length() && i<apellido.length()){
                matriz[i][i] = ' ';
                matriz[i][2 * longitudMaxima - 2 - i] = Character.toUpperCase(apellido.charAt(i)) ;
            }else if (i >= apellido.length() && i<nombre.length()) {
                matriz[i][i] = Character.toUpperCase(nombre.charAt(i));
                matriz[i][2 * longitudMaxima - 2 - i] = ' ' ;
            } else{
                matriz[i][i] = Character.toUpperCase(nombre.charAt(i));
                matriz[i][2 * longitudMaxima - 2 - i] = Character.toUpperCase(apellido.charAt(i));
            }
            
        }

        imprimirMatriz(matriz);
    }
    public static void imprimirMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print((c == 0) ? " " : c);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
