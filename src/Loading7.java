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
int index = 0;

while (progress < total) {
    String bar = "[";
    for (int i = 0; i < total; i++) {
        if (i < progress) {
            bar += "=";
        } else if (i == progress) {
            bar += rotator[index];
            index = (index + 1) % rotator.length;
        } else {
            bar += " ";
        }
    }
    bar += "] " + (progress * 100 / total) + "%";
    System.out.print("\r" + bar);
    progress++;
    Thread.sleep(100);
}
System.out.println("\nProceso completado!");

    }
}