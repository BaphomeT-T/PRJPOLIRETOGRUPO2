public class figura14 {
    public void imprimirFigura14(int tamano){
        for (int i = 0; i < tamano; i++) {
            // Imprimir espacios en blanco antes de los números
            for (int j = 0; j < tamano - i; j++) {
                System.out.print("  ");
            }

            // Imprimir números en cada fila
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "    ");
            }

            // Nueva línea para el siguiente nivel
            System.out.println();
        }
        
    }
    private int binomialCoefficient(int n, int k) {
            if (k == 0 || k == n) {
                return 1;
            } else {
                return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
            }

        }
}

