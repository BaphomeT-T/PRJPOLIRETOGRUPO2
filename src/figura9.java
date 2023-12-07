public class figura9 {
    public void imprimirFigura9(int tamano){
        for (int i = 0; i < tamano; i++) {
            
            for (int j = 0; j < 4 * (tamano - i - 1); j++) {
                System.out.print(" ");
            }

            
            System.out.print(" ___|");

            
            for (int j = 0; j < 8 * i; j++) {
                System.out.print(" ");
            }

            System.out.println("|___");
        }

    }
}
