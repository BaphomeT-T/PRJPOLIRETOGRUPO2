public class Loading3 {
    public void showLoading3(char caracter){
        int porcentaje = 0;
        String barra = "                        "; // 20 spaces to represent the bar
    
        while (porcentaje <= 50) {
            
            System.out.print("\r[" + barra.substring(0, (porcentaje*2) / 5) + caracter + barra.substring((porcentaje*2) / 5 + 1) + "] " + porcentaje + "%");

            
            porcentaje += 5;
            try {
                Thread.sleep(100); // Delay for smooth animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (porcentaje > 50 && porcentaje<=100) {
            
            System.out.print("\r[" + barra.substring((porcentaje) / 5 + 1)+ caracter +barra.substring(0, (porcentaje) / 5)   + "] " + porcentaje + "%");
            porcentaje += 5;
            try {
                Thread.sleep(100); // Delay for smooth animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

                        

    }
        
    
}
