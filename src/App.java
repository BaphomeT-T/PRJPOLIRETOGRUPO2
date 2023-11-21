import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        SerieNumerica6 oSerieNumerica6 = new SerieNumerica6();
        SerieNumerica7 oSerieNumerica7 = new SerieNumerica7();
        SerieNumerica8 oSerieNumerica8 = new SerieNumerica8();
        SerieNumerica9 oSerieNumerica9 = new SerieNumerica9();
        SerieNumerica10 oSerieNumerica10 = new SerieNumerica10();
        Ejercicio5 oEjercicio5 = new Ejercicio5();
        SerieNumerica03 oSerieNumerica03 = new SerieNumerica03();
        SerieNumerica12 oSerieNumerica12= new SerieNumerica12();

        int numTerminos;
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Grupo: ...");
        System.out.println("Integrantes: Julian Camacho, Juan Chanatasig, Andrea Chicaiza, Antony Cobos, Paul Davila, Edison Dueñas, Isabella Hernandez" );
         System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("Ingrese el número de veces que desea repetir las series");
        numTerminos = Integer.parseInt(sc.nextLine());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Serie 10: 3, 9, 27, 81, 243, 729, 2187, ...");
        System.out.println("");
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