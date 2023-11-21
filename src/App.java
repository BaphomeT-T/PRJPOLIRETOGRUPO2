import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SerieNumerica10 oSerieNumerica10 = new SerieNumerica10();
        Ejercicio5 oEjercicio5 = new Ejercicio5();
        SerieNumerica03 oSerieNumerica03 = new SerieNumerica03();
        SerieNumerica12 oSerieNumerica12= new SerieNumerica12();

        int numTerminos;
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Grupo: ...");
        System.out.println("Integrantes: Julian Camacho, Juan Chanatasig, Andrea Chicaiza, Antony Cobos, Paul Davila, Edison Dueñas, Isabella Hernandez" );
         System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
      

         System.out.println("");
        System.out.println("Ingrese el número de veces que desea repetir las series");
        numTerminos = Integer.parseInt(sc.nextLine());
         System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Serie 3: 0/1  1/3  1/5  2/7  3/9   5/11  8/13  13/15 ... ");
        System.out.println("Usando For");
        oSerieNumerica03.showSerie03For(numTerminos);
        System.out.println("");
        System.out.println("Usando el While");
        oSerieNumerica03.showSerie03While(numTerminos);
        System.out.println("");
        System.out.println("Usando el Do While");
        oSerieNumerica03.showSerie03DoWhile(numTerminos);
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Serie 5: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, ...");
        System.out.println("Usando for:");
        oEjercicio5.showSerie5For(numTerminos);
        System.out.println("");
        System.out.println("Usando While:");
        oEjercicio5.showSerie5While(numTerminos);
        System.out.println("");
        System.out.println("Usando doWhile:");
        oEjercicio5.showSerie5doWhile(numTerminos);
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("Serie 10: 3, 9, 27, 81, 243, 729, 2187, ...");
        System.out.println("Usando for:");
        oSerieNumerica10.showSerie10For(numTerminos);
        System.out.println("Usando While:");
        oSerieNumerica10.showSerie10While(numTerminos);
        System.out.println("Usando doWhile:");
        oSerieNumerica10.showSerie10doWhile(numTerminos);
        System.out.println("Usando Recursividad:");
        oSerieNumerica10.showSerie10Recursividad(numTerminos,3);

        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("Serie 12: 2  6   12  20  30  42  56  72  ...");
        System.out.println("Usando for");
        oSerieNumerica12.showSerie12For(numTerminos);
        System.out.println("Usando While");
        oSerieNumerica12.showSerie12While(numTerminos);
        System.out.println("Usando el DoWhile10");
        oSerieNumerica12.showSerie12DoWhile(numTerminos);

    }
}
