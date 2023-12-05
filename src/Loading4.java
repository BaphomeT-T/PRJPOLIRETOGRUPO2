/**
 * Copyright (C) 2k23,  lalabell-a
 * JavaGenius, ihavequestion29@gmail.com
 * version 1.0
 */

  public class Loading4 {

    public static void ShowLoading4For() {
        String[] SignoCarga = {"0oo", "o0o", "oo0", "o0o"};

        for (int i = 0; i <= 100; i++) {
            String c = SignoCarga[i % 4];
            System.out.print("\r" + c + " " + i + " %");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println(); // Add a newline after the progress bar
    }
}
