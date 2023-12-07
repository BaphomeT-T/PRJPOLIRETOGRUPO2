public class Loading2 {

    public static void indicadorDeCargaPersonalizado(char caracter) {
        int totalPasos = 20;

        for (int i = 0; i <= totalPasos; i++) {
            int porcentaje = (i * 100) / totalPasos; // Ajustar la fórmula del porcentaje
            int longitudBarra = i;

            String barra = generarBarraCarga(caracter, longitudBarra);

            System.out.print("\r[" + barra + "] " + porcentaje + "% ");

            // Simula un retraso para que puedas ver el movimiento
            try {
                Thread.sleep(100); // Ajusta el tiempo de retardo según sea necesario
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n¡Carga completa!");
    }

    public static String generarBarraCarga(char caracter, int longitud) {
        StringBuilder barra = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            barra.append(caracter);
        }

        return barra.toString();
    }
}