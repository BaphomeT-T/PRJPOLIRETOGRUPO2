public class figura15 {
    public void imprimirFigura15(int tamano){
        for (int i = 0; i < tamano; i++) {
   
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "   ");
            }

           
            System.out.println();
        }
    }

    private static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}