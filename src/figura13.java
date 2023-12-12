public class figura13 {
    public void imprimirFigura13(int tamano){
        for (int i = 1; i <= tamano; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}