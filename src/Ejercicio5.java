/**
 * Autor: Julián Camacho
 * Version 1.0
 **/

/* Serie 5: 2, 3, 5, 7, 11, 13, 17, 19, 23 ... La serie es de numeros primos. */

public class Ejercicio5 {
    /**
     * @param numTerminos Cantidad de numeros a generar.
    */
    
    public void showSerie5For(int numTerminos) {
        for (int cont = 0, termino = 2; cont < numTerminos; termino++) {
            if (esPrimo(termino)) {
                System.out.print(termino + " ");
                cont++;
            }
        }
    }

   /**
     * @param numTerminos Cantidad de numeros a generar.
    */

    public void showSerie5While(int numTerminos) {
        int cont = 0;
        int termino = 2;
        while (cont < numTerminos) {
            if (esPrimo(termino)) {
                System.out.print(termino + " ");
                cont++;
            }
            termino++;
        }
    }

   /**
     * @param numTerminos Cantidad de numeros a generar.
    */
    
    public void showSerie5doWhile(int numTerminos) {
        int cont = 0;
        int termino = 2;
        do {
            if (esPrimo(termino)) {
                System.out.print(termino + " ");
                cont++;
            }
            termino++;
        } while (cont < numTerminos);
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
