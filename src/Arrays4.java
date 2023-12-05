public class Arrays4 {
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

               //matriz[2 * longitudMaxima - 2 - i][i] = Character.toUpperCase(apellido.charAt(apellido.length()-1));
               // matriz[2 * longitudMaxima - 2 - i][2 * longitudMaxima - 2 - i] = Character.toUpperCase(apellido.charAt(apellido.length()-1)); 
            } else{
                matriz[i][i] = Character.toUpperCase(nombre.charAt(i));
                matriz[i][2 * longitudMaxima - 2 - i] = Character.toUpperCase(apellido.charAt(i));
                //matriz[2 * longitudMaxima - 2 - i][i] = Character.toUpperCase(apellido.charAt(i));
                //matriz[2 * longitudMaxima - 2 - i][2 * longitudMaxima - 2 - i] = Character.toUpperCase(apellido.charAt(i));
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
