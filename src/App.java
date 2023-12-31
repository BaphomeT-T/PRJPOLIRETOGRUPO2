import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        char seguir = 's';
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Grupo: JavaGenius");
        System.out.println("Integrantes: Julian Camacho, Juan Chanatasig, Andrea Chicaiza, Antony Cobos, Paul Davila, Edison Dueñas, Isabella Hernandez" );
         System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("");
        do {
            System.out.println("Ingrese la opcion que desee:");
            System.out.println("(1) Series numericas");
            System.out.println("(2) Series de caracteres");
            System.out.println("(3) Figuras");
            System.out.println("(4) Cadena de caracteres");
            System.out.println("(5) Arrays");
            System.out.println("(6) Loading");
            System.out.println("(7) Recursion");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            switch (opcion) {
                case 1:
                    
                    int numTerminos;

                    System.out.println(" >> Series Numéricas");
                    System.out.println("Ingrese el número de veces que desea repetir las series");
                    numTerminos = Integer.parseInt(sc.nextLine());
                    System.out.println("");
         
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
         
                    SerieNumerica1 oSerieNumerica1 = new SerieNumerica1();
                     System.out.println("");
                     System.out.println("Serie 1: 0 1 1 2 3 5 8 13 ...");
                     System.out.println("");
                     System.out.println("Usando for:");
                     oSerieNumerica1.ShowSerie1For(numTerminos);
                     System.out.println("");
                     System.out.println("Usando While:");
                     oSerieNumerica1.ShowSerie1While(numTerminos);
                     System.out.println("");
                     System.out.println("Usando doWhile:");
                     oSerieNumerica1.ShowSerie1Dowhile(numTerminos);
                     System.out.println("");

                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
                     SerieNumerica2 oSerieNumerica2 = new SerieNumerica2();
                     System.out.println("");
                     System.out.println("Serie 2: 1 0 3 0 5 0 7 0 9 ...");
                     System.out.println("");
                     System.out.println("Usando for:");
                     oSerieNumerica2.ShowSerie2For(numTerminos);
                     System.out.println("");
                     System.out.println("Usando While:");
                     oSerieNumerica2.ShowSerie2While(numTerminos);
                     System.out.println("");
                     System.out.println("Usando doWhile:");
                     oSerieNumerica2.ShowSerie2Dowhile(numTerminos);
                     System.out.println("");

                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
                     SerieNumerica3 oSerieNumerica3 = new SerieNumerica3();
                     System.out.println("");
                     System.out.println("Serie 3: 0/1  1/3  1/5  2/7  3/9   5/11  8/13  13/15 ...");
                     System.out.println("");
                     System.out.println("Usando for:");
                     oSerieNumerica3.showSerie03For(numTerminos);
                     System.out.println("");
                     System.out.println("Usando While:");
                     oSerieNumerica3.showSerie03While(numTerminos);
                     System.out.println("");
                     System.out.println("Usando doWhile:");
                     oSerieNumerica3.showSerie03DoWhile(numTerminos);
                     System.out.println("");

                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
                     SerieNumerica4 oSerieNumerica4 = new SerieNumerica4();
                     System.out.println("");
                     System.out.println("Serie 4: 0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ...");
                     System.out.println("");
                     System.out.println("Usando for:");
                     oSerieNumerica4.showSerieNumerica4(numTerminos);
                     System.out.println("");
                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
                     SerieNumerica5 oSerieNumerica5 = new SerieNumerica5();
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

                     SerieNumerica6 oSerieNumerica6 = new SerieNumerica6();
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
        
                     SerieNumerica7 oSerieNumerica7 = new SerieNumerica7();
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

                     SerieNumerica8 oSerieNumerica8 = new SerieNumerica8();
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
        
                     SerieNumerica9 oSerieNumerica9 = new SerieNumerica9();
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
                     SerieNumerica10 oSerieNumerica10 = new SerieNumerica10();

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
                     SerieNumerica12 oSerieNumerica12 = new SerieNumerica12();

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
                     
                    break;
                case 2:
                int numCaracteres;

                System.out.println(" >> Series de Caracteres");
                System.out.println("Ingrese el número de veces que desea repetir las series");
                numCaracteres = Integer.parseInt(sc.nextLine());
                System.out.println("");

                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

                Caracteres1 oCaracteres1 = new Caracteres1();
                System.out.println("");
                System.out.println("Serie 1: +, -, +, - ...");
                System.out.println("");
                oCaracteres1.ShowCaracteres1For(numCaracteres);
                System.out.println("");
                Caracteres2 oCaracteres2 = new Caracteres2();
                System.out.println("");
                System.out.println("Serie 2: + + ++ +++ +++++ ++++++++");
                System.out.println("");
                oCaracteres2.ShowCaracteres2While(numCaracteres);
                System.out.println("");
                Caracteres3 oCaracteres3 = new Caracteres3();
                System.out.println("");
                System.out.println("Serie 3:++ +++ +++++ +++++++ ...");
                System.out.println("");
                oCaracteres3.ShowCaracteres3For(numCaracteres);
                System.out.println("");
                System.out.println("");
                Caracteres4 oCaracteres4 = new Caracteres4();
                System.out.println("");
                System.out.println("Serie 4:+  -  *  /  +  -  *  / +  -  *  /  ....");
                System.out.println("");
                oCaracteres4.ShowCaracteres4For(numCaracteres);
                System.out.println("");
                Caracteres5 oCaracteres5 = new Caracteres5();
                System.out.println("");
                System.out.println("Serie 5: \\  |  / - ...");
                System.out.println("");
                oCaracteres5.ShowCaracteres5For(numCaracteres);
                System.out.println("");
                Caracteres6 oCaracteres6 = new Caracteres6();
                System.out.println("");
                System.out.println("Serie 6: a  b   c   d   e   f   g   h   ...");
                System.out.println("");
                oCaracteres6.ShowCaracteres6For(numCaracteres);
                System.out.println("");
                System.out.println("");
                Caracteres6dos oCaracteres6dos = new Caracteres6dos();
                System.out.println("");
                System.out.println("Serie 6: a  +   c   -   e   +   g   -   ...");
                System.out.println("");
                oCaracteres6dos.ShowCaracteres6dosFor(numCaracteres);
                System.out.println("");
                System.out.println("");
                Caracteres7 oCaracteres7 = new Caracteres7();
                System.out.println("");
                System.out.println("Serie 7:aa   bbbb  cccccc  dddddddd  ...");
                System.out.println("");
                oCaracteres7.ShowCaracteres7For(numCaracteres);
                System.out.println("");
                System.out.println("");
                Caracteres8 oCaracteres8 = new Caracteres8();
                System.out.println("");
                System.out.println("Serie 8:a  bbb  ccccc  ddddddd eeeeeeeee...");
                System.out.println("");
                oCaracteres8.ShowCaracteres8For(numCaracteres);
                System.out.println("");
                System.out.println("");
                Caracteres9 oCaracteres9 = new Caracteres9();
                System.out.println("");
                System.out.println("Serie 9:a  b  c  dd  eee  fffff  gggggggg...");
                System.out.println("");
                oCaracteres9.showCaracteres9(numCaracteres);
                System.out.println("");
                break;
                case 3:
                    int niveles = 0;

                    System.out.println(" >> Figuras");
                    System.out.println("Ingrese el tamaño/niveles de las figuras");
                    niveles = Integer.parseInt(sc.nextLine());
                    System.out.println("");
                    
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 1: ");
                    System.out.println("");
                    Figuras1 oFiguras1 = new Figuras1();
                    oFiguras1.showFigura1(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 2: ");
                    System.out.println("");
                    Figuras2 oFiguras2 = new Figuras2();
                    oFiguras2.showFigura2(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 3: ");
                    System.out.println("");
                    Figuras3 oFiguras3 = new Figuras3();
                    oFiguras3.showFigura3(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 4: ");
                    System.out.println("");
                    Figuras4 oFiguras4 = new Figuras4();
                    oFiguras4.showFigura4(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 5: ");
                    System.out.println("");
                    Figuras5 oFiguras5 = new Figuras5();
                    oFiguras5.showFigura5(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 6: ");
                    System.out.println("");
                    Figuras6 oFiguras6 = new Figuras6();
                    oFiguras6.showFigura6(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 7: ");
                    System.out.println("");
                    Figuras7 oFiguras7 = new Figuras7();
                    oFiguras7.showFigura7(niveles);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");

                    System.out.println("Figura 8: ");
                    System.out.println("");
                    figura8 oFigura8=new figura8();
                    oFigura8.imprimirfigura8(niveles);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    
                    System.out.println("Figura 9: ");
                    System.out.println("");
                    figura9 oFigura9=new figura9();
                    oFigura9.imprimirFigura9(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    
                    System.out.println("Figura 10 ");
                    System.out.println("");
                    figura10 oFigura10=new figura10();
                    oFigura10.imprimirFigura10(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    
                    System.out.println("Figura 11 ");
                    System.out.println("");
                    figura11 oFigura11=new figura11();
                    oFigura11.imprimirFigura11(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    
                    System.out.println("Figura 12 ");
                    System.out.println("");
                    figura12 oFigura12=new figura12();
                    oFigura12.imprimirFigura12(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    
                    System.out.println("Figura 13 ");
                    System.out.println("");
                    figura13 oFigura13=new figura13();
                    oFigura13.imprimirFigura13(niveles);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    
                    System.out.println("Figura 14 ");
                    System.out.println("");
                    figura14 oFigura14=new figura14();
                    oFigura14.imprimirFigura14(niveles);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    
                    System.out.println("Figura 15 ");
                    System.out.println("");
                    figura15 oFigura15=new figura15();
                    oFigura15.imprimirFigura15(niveles);
                    
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                   
                    System.out.println("");
                    System.out.println("Figura 16: ");
                    System.out.println("");
                    Figuras16 oFiguras16 = new Figuras16();
                    oFiguras16.showFigura16(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  
                    System.out.println("");
                    System.out.println("Figura 17: ");
                    System.out.println("");
                    Figuras17 oFiguras17 = new Figuras17();
                    oFiguras17.showFigura17(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    
                    System.out.println("");
                    System.out.println("Figura 18: ");
                    System.out.println("");
                    Figuras18 oFiguras18 = new Figuras18();
                    oFiguras18.showFigura18(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    
                    System.out.println("");
                    System.out.println("Figura 19: ");
                    System.out.println("");
                    Figuras19 oFiguras19 = new Figuras19();
                    oFiguras19.showFigura19(niveles);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                                






                break;

                case 4:
                    String palabraOriginal;
                    Character vocalAQuitar;
                    Character letraAQuitar;

                System.out.println(" >> Cadenas de Caractteres");
                System.out.println("Ingrese la frase a la que desea que se realice los cambios");
                palabraOriginal = sc.nextLine();

                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("Cadena 1: Pedir una frase y contar las vocales.");
                System.out.println("");
                CadenaCaracteres1 oCadenaCaracteres1 = new CadenaCaracteres1();
                oCadenaCaracteres1.showCadenaCaracteres1(palabraOriginal);

                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("Cadena 2: Pedir una frase y contar las consonantes.");
                System.out.println("");
                CadenaCaracteres2 oCadenaCaracteres2 = new CadenaCaracteres2();
                oCadenaCaracteres2.showCadenaCaracteres2(palabraOriginal);

                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("Cadena 3: Pedir una frase y una vocal, eliminar la vocal ingresada de la frase.");
                System.out.println("");
                CadenaCaracteres3 oCadenaCaracteres3 = new CadenaCaracteres3();
                System.out.println("Ingrese la vocal que desea eliminar");
                vocalAQuitar = sc.nextLine().charAt(0);
                oCadenaCaracteres3.showCadenaCaracteres3(palabraOriginal, vocalAQuitar);
                

                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("Cadena 4: Pedir una frase y una letra, eliminar la letra ingresada de la frase.");
                System.out.println("");
                CadenaCaracteres4 oCadenaCaracteres4 = new CadenaCaracteres4();
                System.out.println("Ingrese la vocal que desea eliminar");
                letraAQuitar = sc.nextLine().charAt(0);
                oCadenaCaracteres4.showCadenaCaracteres4(palabraOriginal, letraAQuitar);



                 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Cadena 5: Pedir una frase y presentarla inverida con las vocales en mayusculas. ");
                  System.out.println("");
                  CadenaCaracteres5 oCadenaCaracteres5 = new CadenaCaracteres5();
                  oCadenaCaracteres5.showCadenaCaracteres5(palabraOriginal);
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Cadena 6: Pedir una frase y presentarla inverida con las consonantes en mayusculas. ");
                  System.out.println("");
                  CadenaCaracteres6 oCadenaCaracteres6 = new CadenaCaracteres6();
                  oCadenaCaracteres6.showCadenaCaracteres6(palabraOriginal);
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Cadena 7: Pedir una frase y presentarla en mayusculas y sin la J ");
                  System.out.println("");
                  CadenaCaracteres7 oCadenaCaracteres7 = new CadenaCaracteres7();
                  oCadenaCaracteres7.showCadenaCaracteres7(palabraOriginal);
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Cadena 8: Anagramas de palabras.  ");
                  System.out.println("");
                  CadenaCaracteres8 oCadenaCaracteres8 = new CadenaCaracteres8();
                  String palabraDeterminar = oCadenaCaracteres8.returnPalabaraRandom();
                  System.out.println("Ingrese el anagrama de la palabra: " + palabraDeterminar);
                  int contador = 3;
                  boolean win = false;
                  do {
                    String palabraAnagrama = sc.nextLine();
                    if (oCadenaCaracteres8.comprobarAnagrama(palabraDeterminar.replaceAll("[^a-z]", "") ,palabraAnagrama.toLowerCase().replaceAll("[^a-z]", "")) ) {
                        System.out.println("Felicidades, encontraste el anagrama");
                        contador = 0;
                        win = true;
                    } else{
                        System.out.println("Respuesta erronea, intente de nuevo");
                        contador--;
                        System.out.println("Intentos restantes: " + contador);
                    }
                  } while (contador > 0);
                  if (win == false) {
                        System.out.println("Se han acabado tus itentos");
                        System.out.println("El anagrama de: "+palabraDeterminar +" es: " + oCadenaCaracteres8.generarRespuesta(palabraDeterminar));
                  }
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Cadena 9: Ingresa una frase y convertir una leta a mayusculas y otra a minisculas ");
                  System.out.println("");
                  CadenaCaracteres9 oCadenaCaracteres9 = new CadenaCaracteres9();
                  oCadenaCaracteres9.showCadenaCaracteres9(palabraOriginal);
                  System.out.println("");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                     
                    break;
                case 5:
                    String nombre;

                    System.out.println(" >> Arrays");
                    System.out.println("Ingrese su nombre completo");
                    nombre = sc.nextLine();
                    String[] nombresCompletos = nombre.split(" ");

                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Arrays 1: Crear una array para cada palabra de su nombre e ingrese el porcentaje de carga para cada palabra. ");
                  System.out.println("");
                  Arrays1 oArrays1 = new Arrays1();
                  int[] porcentajes = new int[nombresCompletos.length];
                  for (int i=0 ;i<nombresCompletos.length;i++){
                    System.out.println( (i<2) ? "Ingrese el porcentaje de su " + (i+1) +"° nombre" : "Ingrese el porcentaje de su " + (i-1) +"° apellio");
                    porcentajes[i]=Integer.parseInt(sc.nextLine());
                  }
                  oArrays1.showArrays1(nombresCompletos, porcentajes);
                  System.out.println("");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Arrays2: Crear una matriz solicitando el tamaño y caracter para almacenar la iniciales de su nombre y apellido y presentar la matriz ");
                  System.out.println("");
                  Arrays2 oArrays2 = new Arrays2();
                  int tamano;
                  char caracter1;
                  System.out.println("Ingrese el tamaño:");
                  tamano = Integer.parseInt(sc.nextLine());
                  System.out.println("Ingrese un carácter para rellenar los arrays:");
                  caracter1 = sc.nextLine().charAt(0);
                  System.out.println("");
                  oArrays2.showArrays2(tamano, caracter1);

                  System.out.println("");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Arrays 3: Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre ");
                  System.out.println("");
                  Arrays3 oArrays3 = new Arrays3();
                  oArrays3.showArrays3(nombresCompletos[0]);
                  System.out.println("");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Arrays 4: Crear un matriz donde forme una X con su nombre y apellido ");
                  System.out.println("");
                  Arrays4 oArrays4 =new Arrays4();
                  oArrays4.showArrays4(nombresCompletos[0],nombresCompletos[2]);
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Arrays 5: Crear un matriz cuadrada del tamaño de su nombre, colocar cada letra de sus nombres completos de forma randomica/aleatorio.\r\n" + //
                          "        En el caso que conincidan las posiciones poner un *. \r\n" + //
                          "        Para visulizar el proceso usar un delay ");
                  Array5 oArray5 = new Array5(); 
                  oArray5.ShowArray5For(nombresCompletos[0]+nombresCompletos[1]+nombresCompletos[2]+nombresCompletos[3]);
                  System.out.println("");
                  
                    break;
                case 6:
                     char caracter ;

                    System.out.println(" >> Loading");
                    System.out.println("Ingrese el caracter que desea en las cargas");
                    caracter = sc.nextLine().charAt(0);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading 1: Indicador de carga desde 0  a 100% usar los signos (\\|/-|) para simular un movimiento rotacional de carga 0% hasta ");
                    Loading1 oLoading1 = new Loading1();
                    oLoading1.indicadorDeCarga();
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading 2: Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres ");
                    Loading2 oLoading2 = new Loading2();
                    oLoading2.indicadorDeCargaPersonalizado(caracter);
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading 3: Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres ");
                    Loading3 oLoading3 = new Loading3();
                    oLoading3.showLoading3(caracter);
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading 4: Waiting que inicia en 0  a 100% usar los signos o0o para simular un movimiento de ida y vuelta en el mismo puesto");
                    Loading4 oLoading4 = new Loading4(); 
                    oLoading4.ShowLoading4For();

                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading 5: Crear una barra es de 20 caracteres, la barra avanza cambiando la punta entre > -");
                    Loading5 oLoading5 = new Loading5(); 
                    oLoading5.imprimprimirLoading5();
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading 6: Crear una barra es de 20 caracteres, la barra <=> se desplaza de izquierda a derecha");
                    Loading6 oLoading6 = new Loading6(); 
                    oLoading6.imprimirLoading6();

                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading 7: Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \\|/-|");
                    Loading7 oLoading7 = new Loading7(); 
                    oLoading7.imprimirLoading7();
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Loading8: Pedir el nombre y apellidos y realizar la carga mostrando letra a letra hasta el 100% ");
                    Loading8 oLoading8 = new Loading8(); 
                    System.out.println("Ingrese su nombre y apellidos:");
                    String nombreCompleto = sc.nextLine();
                    oLoading8.mostrarNombrePorcentaje(nombreCompleto);
                    System.out.println("");
                    
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Loading9: Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100% ");
                    Loading9 oLoading9 = new Loading9();
                    oLoading9.mostrarNombrePorcentaje(nombreCompleto);  
                    System.out.println("");

                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("Desplazar la figura a la derecha y regresar  ");
                    Loading10 oLoading10 = new Loading10();
                    oLoading10.desplazarFigura();
                    System.out.print("\033[H\033[2J");
                    
                    break;
                case 7:
                    int numA, numB;

                    System.out.println(" >> Recursion");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("crear un metodo recursivo para obtener factorial(n)  ");
                    CalcularFactorial oCalcularFactorial = new CalcularFactorial();
                    System.out.print("Ingrese un número para calcular el factorial: ");
                    int n = Integer.parseInt(sc.nextLine());
                    long resultado = oCalcularFactorial.calcularFactorial(n);
                    System.out.println("El factorial de " + n + " es: " + resultado);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("crear un metodo recursivo para obtener la suma(a,b)");
                    SumaRecursiva oSumaRecursiva = new SumaRecursiva();
                    System.out.print("Ingrese el valor de a: ");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el valor de b: ");
                    int b = Integer.parseInt(sc.nextLine());
                    int resultadoSuma = oSumaRecursiva.obtenerSuma(a, b);
                    System.out.println("La suma de " + a + " y " + b + " es: " + resultadoSuma);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("crear un metodo recursivo para obtener la multiplicacion(c,d)");
                    MultiplicacionRecursiva oMultiplicacionRecursiva = new MultiplicacionRecursiva();
                    System.out.print("Ingrese el valor de c: ");
                    int c = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el valor de d: ");
                    int d = Integer.parseInt(sc.nextLine());
                    int resultadoMultiplicacion = oMultiplicacionRecursiva.realizarMultiplicacion(c, d);
                    System.out.println("La multiplicación de " + c + " y " + d + " es: " + resultadoMultiplicacion);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("crear un metodo recursivo para obtener la potencia(e,f)");
                    PotenciaRecursiva oPotenciaRecursiva = new PotenciaRecursiva();
                    System.out.print("Ingrese el valor de la base (e): ");
                    int e = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el valor del exponente (f): ");
                    int f = Integer.parseInt(sc.nextLine());
                    int resultadoPotencia = oPotenciaRecursiva.calcularPotencia(e, f);
                    System.out.println(e + " elevado a la " + f + " es: " + resultadoPotencia);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("crear un metodo recursivo para obtener la conteoProgregresivoHasta(n) / imprimir el avance");
                    ConteoProgresivo oConteoProgresivo = new ConteoProgresivo();
                    System.out.print("Ingrese el valor de m para el conteo progresivo: ");
                    int m = Integer.parseInt(sc.nextLine());
                    System.out.println("Comenzando el conteo progresivo:");
                    oConteoProgresivo.conteoProgresivoHasta(m, 1);

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0 / imprimir el avance");
                    ConteoRegresivo oConteoRegresivo = new ConteoRegresivo();
                    System.out.print("Ingrese el valor de x para el conteo regresivo: ");
                    int x = Integer.parseInt(sc.nextLine());
                    System.out.println("Comenzando el conteo regresivo:");
                    oConteoRegresivo.conteoRegresivoDesde(x);
                    
                    break;
            
                default:
                    break;
            }
            System.out.println("Si desea continuar digite (s)");
            seguir = sc.nextLine().charAt(0);
        } while (Character.toLowerCase(seguir) == 's');
        

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                               Fin del Programa");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println(" ");
        
    }
}