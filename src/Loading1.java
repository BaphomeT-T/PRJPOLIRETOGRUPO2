
    public class Loading1 {
    
        public static void indicadorDeCarga() {
            int totalPasos = 100;
    
            for (int i = 0; i <= totalPasos; i++) {
                int porcentaje = i;
                String indicador = obtenerIndicadorRotacional(i);
    
                System.out.print("\rCargando: " + indicador +" " + porcentaje + "% ");
    
                // Simula un retraso para que puedas ver el movimiento
                try {
                    Thread.sleep(100); // Ajusta el tiempo de retardo según sea necesario
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    
            System.out.println("\n¡Carga completa!");
        }
        public static String obtenerIndicadorRotacional(int paso) {
            String[] rotacion = {"|", "/", "-", "\\"};
            return rotacion[paso % rotacion.length];
        }
    }
    
