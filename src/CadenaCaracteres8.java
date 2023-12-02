/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 3.0
 */

public class CadenaCaracteres8 {
    private String[] arregloAnagramas = {"delira" , "lidera" , "ballena", "llenaba", "alondra", "ladrona", "españa", "apañes", "enrique", "quieren"};
       /**
        * Retorna una palabra random de un arreglo de strings.
        *
        * @return una palabra random de un arreglo de strings.
        */
    public String returnPalabaraRandom(){
        return arregloAnagramas[6];      
        //return arregloAnagramas[(int) (Math.random() * arregloAnagramas.length)];


   }

   /**
    * Checkea si dos strings sonn anagramas
    *
    * @param palabraOriginal palabra original a comparar
    * @param posAnagrama posible aagrama a comparar
    * @return true si son aanagramas, false de cualquier otra manera.
    */
   public boolean comprobarAnagrama(String palabraOriginal, String posAnagrama) {
       boolean valorVerdad = true;
       for (int i = 0; i < posAnagrama.length(); i++) {
           if (!palabraOriginal.contains(Character.toString(posAnagrama.charAt(i))) || palabraOriginal.length() != posAnagrama.length() || palabraOriginal.equals(posAnagrama)) {
               return false;
           }
       }
       return true;
   }

   public String generarRespuesta(String palabraOriginal){
    for(int i =0; i<arregloAnagramas.length; i++){
        if (comprobarAnagrama(palabraOriginal, arregloAnagramas[i])) {
            return arregloAnagramas[i];
        }
    }
    return "error";
   }
   
}
