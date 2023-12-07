
/*
 * Copyright (C) 2k23, BaphomeT-T
 * (JavaGenius), pdavila0113@gmail.com
 * Version 3.0
 */public class Loading3 {
    /**
     * Displays a loading bar animation in the console using a specified character.
     * The loading bar progresses from 0% to 100% in increments of 5%.
     *
     * @param caracter caracter usado en el loadinng
     */
    public void showLoading3(char caracter) {
        int porcentaje = 0;
        int porcentajeAuxiliar = 0;
        String barra = "                    ";

        while (porcentaje <= 100) {

            if (porcentajeAuxiliar == 20) {
                for (porcentajeAuxiliar = 20; porcentajeAuxiliar > 0; porcentajeAuxiliar--) {
                    System.out.print("\r[" + barra.substring(0, porcentajeAuxiliar) + caracter + barra.substring(porcentajeAuxiliar) + "] " + porcentaje + "%");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            } else {
                for (porcentajeAuxiliar = 0; porcentajeAuxiliar < 20; porcentajeAuxiliar++) {
                    System.out.print("\r[" + barra.substring(0, porcentajeAuxiliar) + caracter + barra.substring(porcentajeAuxiliar) + "] " + porcentaje + "%");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            porcentaje += 5;

        }

    }
        
    
}
