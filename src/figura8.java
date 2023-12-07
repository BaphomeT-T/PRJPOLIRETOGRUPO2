/*
 * Copyright (c),JfraGar
 * (javaGenius) jfchanatasig1405@gmail.com
 * version 1.0
 */
public class figura8 {
    /**
     * Funcion que imprime una figura con niveles que ingrese
     * @param tamano
     */
    public void imprimirfigura8(int tamano){
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < 4 * (tamano - i - 1); j++) {
                System.out.print(" ");
            }

            System.out.println(" ___|");
        }
    }

}
