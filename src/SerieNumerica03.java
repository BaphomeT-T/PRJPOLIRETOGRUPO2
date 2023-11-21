public class SerieNumerica03{
    /**
     * <b>showSerie03For</b> muestra la serie: 0/1  1/3  1/5  2/7  3/9   5/11  8/13  13/15 ... usando for.
     * @param numTerminos
     */

    public void showSerie03For(int numTerminos){

        for (int i = 0; i < numTerminos; i++) {
            int numerador = serieFibonacii(i);
            int denominador = 2 * i + 1;
            System.out.print(numerador + "/" + denominador + " ");
    }
}

   
    private int serieFibonacii(int numTerminos ){
        
        return (numTerminos<=1)? numTerminos:serieFibonacii(numTerminos-1)+serieFibonacii(numTerminos-2); 

        /*if (numTerminos <= 1) {
            return numTerminos;
        } else {
            return serieFibonacii(numTerminos - 1) + serieFibonacii(numTerminos - 2);
        }
         */
    }
}