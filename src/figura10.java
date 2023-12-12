public class figura10 {
    public void imprimirFigura10(int tamano){
        for (int i = 0; i < tamano; i++) {
            
            for (int j = 0; j < 5 * i; j++) {
                System.out.print(" ");
            }

            System.out.println((i==0)?"_+_":"|_+_");

            
            for (int j = 0; j < 5 * i; j++) {
                System.out.print(" ");
            }

            System.out.println("  |_-_");
        }
    }
}

