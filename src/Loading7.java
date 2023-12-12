/*
 * Copyright (C) 2k23, JFranGar
 * (JavaGenius), jfchanatasig1405@gmail.com
 * Version 1.0
 */
public class Loading7 {
    /**
     * Muestra el loanding7 
     * @throws InterruptedException
     */
    public void imprimirLoading7() throws InterruptedException{
        int progress = 0;
int total = 20;
char[] rotator = {'/', '-', '\\', '|'};
int index = 0; // Índice para seleccionar el siguiente símbolo de rotación

while (progress < total) {
    String bar = "[";
    for (int i = 0; i < total; i++) {
        if (i < progress) {
            bar += "="; //Parte de la barra completa
            
        } else if (i == progress) {
            bar += rotator[index]; //Simbolo de rotacion actual
            index = (index + 1) % rotator.length; //cambia el signo de rotacion 
        } else {
            bar += " "; //Parte de la barra pendiente 
        }
    }
    bar += "] " + (progress * 100 / total) + "%"; //Porcentaje completado
    System.out.print("\r" + bar); // Imprime en la misma línea utilizando el retorno de carro ("\r")
    progress++;
    Thread.sleep(100); // Espera durante 100 milisegundos para simular la carga
}
// Nueva línea después de completar la carga
System.out.println("\nProceso completado!");

    }
}