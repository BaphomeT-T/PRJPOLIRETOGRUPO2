/*
 * Copyright (C) 2k23, JuliaanCZ
 * (JavaGenius), juliancamacho897@gmail.com
 * Version 1.0
 */

public class SerieNumerica4 {

/**
 * Imprime la serie de caracteres 9 con las letras del abecedario, las primeras tres se presentan una
 * sola vez y las demas se presentan.
 * 
 * @param numTerminos corresponde a la cantidad de caracteres a presentar. 
 */
    public void showSerieNumerica4(int n) {
        int numerador1 = 0, numerador2 = 1, denominador = 2;

        for (int i = 0; i < n; i++) {
            System.out.print(numerador1 + "/" + denominador + " ");
            int nuevoNumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = nuevoNumerador;
            denominador = denominador+2;
        }
    }
}