/*
 * Copyright (C) 2k23, JFranGar
 * (JavaGenius), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class Loading6 {
    /**
     * Imprime un indicador de carga (loading) en consola.
     * 
     * @throws InterruptedException Si hay una interrupción durante la espera.
     */
    public void imprimirLoading6() throws InterruptedException{
        int porcentaje = 0;
        // Bucle para actualizar el porcentaje y la barra de carga
        while (porcentaje <= 100) {
            String barra = "                    ";
            // Configuración especial para el 100% de carga
            if (porcentaje == 100) {
                barra = "                 <=>";
            }else if(porcentaje <=15)
            {
                // Configuración especial para los primeros 15%
                barra = "<=>                 ";
            } 
            else {
                // Calcular la posición de la barra de carga en función del porcentaje
                int posicion = (porcentaje / 5) - 3;
                // Actualizar la barra de carga
                barra = barra.substring(0, posicion) + "<=>" + barra.substring(posicion + 3);
            }
            // Imprimir en la misma línea utilizando el retorno de carro "\r"
            System.out.print("\r" + "[" + barra + "]" + " " + porcentaje + "%");
             // Hacer que el programa espere durante 100 milisegundos (simula la carga)
            Thread.sleep(100);
            // Incrementar el porcentaje
            porcentaje += 5;
        }
        // Nueva línea después de completar la carga
        System.out.println("\nCarga completada");
        
    }
    
}
