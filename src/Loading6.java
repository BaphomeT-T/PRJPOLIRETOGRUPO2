/*
 * Copyright (C) 2k23, JFranGar
 * (JavaGenius), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class Loading6 {
    public void imprimirLoading6() throws InterruptedException{
        int porcentaje = 0;
        while (porcentaje <= 100) {
            String barra = "                    ";
            if (porcentaje == 100) {
                barra = "                 <=>";
            }else if(porcentaje <=15)
            {
                barra = "<=>                 ";
            } 
            else {
                int posicion = (porcentaje / 5) - 3;
                barra = barra.substring(0, posicion) + "<=>" + barra.substring(posicion + 3);
            }
            System.out.print("\r" + "[" + barra + "]" + " " + porcentaje + "%");
            Thread.sleep(100);
            porcentaje += 5;
        }
        System.out.println("\nCarga completada");
        
    }
    
}
