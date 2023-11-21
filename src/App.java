import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        SerieNumerica3 oSerieNumerica3 = new SerieNumerica3();
        SerieNumerica5 oSerieNumerica5 = new SerieNumerica5();
        SerieNumerica6 oSerieNumerica6 = new SerieNumerica6();
        SerieNumerica7 oSerieNumerica7 = new SerieNumerica7();
        SerieNumerica8 oSerieNumerica8 = new SerieNumerica8();
        SerieNumerica9 oSerieNumerica9 = new SerieNumerica9();
        SerieNumerica10 oSerieNumerica10 = new SerieNumerica10();
        SerieNumerica12 oSerieNumerica12 = new SerieNumerica12();

        int numTerminos;
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
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
        System.out.println("");
        System.out.println("Usando for:");
        oSerieNumerica5.showSerie5For(numTerminos);
        System.out.println("");
        System.out.println("Usando While:");
        oSerieNumerica5.showSerie5While(numTerminos);
        System.out.println("");
        System.out.println("Usando doWhile:");
        oSerieNumerica5.showSerie5doWhile(numTerminos);
        System.out.println("");
      
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Serie 6: 1, 4, 9, 16, 25, 36, 49, 64,....");
        System.out.println("");
        System.out.println("Usando for:");
        oSerieNumerica6.showSerie6For(numTerminos);
        System.out.println("Usando While:");
        oSerieNumerica6.showSerie6While(numTerminos);
        System.out.println("Usando DoWhile:");
        oSerieNumerica6.showSerie6DoWhile(numTerminos);
        System.out.println("Usando Recursividad:");
        oSerieNumerica6.showSerie6Recursividad(1,numTerminos);
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("Serie 7: 1, 4, 7, 10, 13, 16, 19, 22, 25,...");
        System.out.println("");
        System.out.println("Usando for:");
        oSerieNumerica7.showSerie7For(numTerminos);
        System.out.println("Usando While:");
        oSerieNumerica7.showSerie7While(numTerminos);
        System.out.println("Usando Do While:");
        oSerieNumerica7.showSerie7DoWhile(numTerminos);
        System.out.println("Usando Recursividad:");
        oSerieNumerica7.showSerie7Recursividad(1,numTerminos);
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("Serie 8: 3, 8, 13, 18, 23, 28, 33, 38, ...");
        System.out.println("");
        System.out.println("Método for:");
        oSerieNumerica8.showserie8For(numTerminos);
        System.out.println("");
        System.out.println("Método while:");
        oSerieNumerica8.showserie8while(numTerminos);
       System.out.println("");
        System.out.println("Método Do-while:");
        oSerieNumerica8.showserie8dowhile(numTerminos);
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
        
        System.out.println("");
        System.out.println("Serie 9: 2, 4, 8, 16, 32, 64, ...");
       System.out.println("");
        System.out.println("Método for:");
        oSerieNumerica9.showserie9For(numTerminos);
        System.out.println("");
        System.out.println("Método while:");
        oSerieNumerica9.showserie9while(numTerminos);
        System.out.println("");
        System.out.println("Método Do-while:");
        oSerieNumerica9.showserie9dowhile(numTerminos);
       System.out.println("");  
       

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

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
        System.out.println("");
        System.out.println("Usando for:");
        oSerieNumerica12.showSerie12For(numTerminos);
        System.out.println("Usando While:");
        oSerieNumerica12.showSerie12While(numTerminos);
        System.out.println("Usando doWhile:");
        oSerieNumerica12.showSerie12DoWhile(numTerminos);
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
    }
}