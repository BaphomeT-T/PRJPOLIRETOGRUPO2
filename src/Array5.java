/**
 * Copyright (C) 2k23,  lalabell-a
 * JavaGenius, ihavequestion29@gmail.com
 * version 1.0
 */

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Array5 {

    public void ShowArray5For(String nombresCompletos) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

       // System.out.print("Ingresa tu nombre completo: ");
        //nombresCompletos = sc.nextLine();
        char[][] matriz = new char[7][7];
        char[] chars = nombresCompletos.replaceAll("\\s", "").toCharArray();

        List<Character> caracteres = new ArrayList<>();
        for (char c : chars) {
            caracteres.add(c);
        }

        Collections.shuffle(caracteres);
        int index = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (index < caracteres.size() && random.nextInt(4) != 0) {
                    char c = caracteres.get(index);
                    if (i < chars.length && c == chars[i]) {
                        matriz[i][j] = '*';
                    } else {
                        matriz[i][j] = c;
                    }
                    index++;
                } else {
                    matriz[i][j] = ' ';
                }
                sb.append(matriz[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        Thread.sleep(1000); 
        sc.close();
    }
}
