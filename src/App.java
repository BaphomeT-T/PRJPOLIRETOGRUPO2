import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SerieNumerica10 oSerieNumerica10 = new SerieNumerica10();
        Ejercicio5 oEjercicio5 = new Ejercicio5();
        Serie6 oSerie6 = new Serie6();
        Serie7 oSerie7 = new Serie7();

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
        System.out.println("Serie 6: 1, 4, 9, 16, 25, 36, 49, 64,....");
        System.out.println("Usando for:");
        oSerie6.showSerie6For(numTerminos);
        System.out.println("Usando While:");
        oSerie6.showSerie6While(numTerminos);
        System.out.println("Usando Do While:");
        oSerie6.showSerie6DoWhile(numTerminos);
        System.out.println("Usando Recursividad:");
        oSerie6.showSerie6Recursividad(1,numTerminos);
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Serie 7: 1, 4, 7, 10, 13, 16, 19, 22, 25,...");
        System.out.println("Usando for:");
        oSerie7.showSerie7For(numTerminos);
        System.out.println("Usando While:");
        oSerie7.showSerie7While(numTerminos);
        System.out.println("Usando Do While:");
        oSerie7.showSerie7DoWhile(numTerminos);
        System.out.println("Usando Recursividad:");
        oSerie7.showSerie7Recursividad(1,numTerminos);
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



    }
}
