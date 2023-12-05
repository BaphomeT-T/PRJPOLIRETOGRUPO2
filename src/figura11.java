public class figura11 {
    public void imprimirFigura11(int tamano){
        for (int i = 1; i <= tamano; i++) {
            System.out.print("|");
        for (int k = 1; k <= i; k++) {
            System.out.print("_ ");
        }
        System.out.println();
        for (int j = 1; j <= tamano + i; j++) {
            System.out.print(" ");
        }
    }
    }
}
