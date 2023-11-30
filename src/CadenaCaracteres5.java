/*
 * Copyright (C) 2k23, BaphomeT-T
 * (...), pdavila0113@gmail.com
 * Version 3.0
 */
public class CadenaCaracteres5 {
    public void showCadenaCaracteres5 (String palabraOriginal){
      StringBuilder palabraInvertia = new StringBuilder();
      for(int i=palabraOriginal.length() -1;i>=0 ;i--){
        char c = palabraOriginal.charAt(i);
        if ((c == 'a') || (c=='e')||(c=='i')||(c=='o')||(c=='u')) {
            palabraInvertia.append(Character.toUpperCase(c));
        } else {
            palabraInvertia.append(c);
        }
      }
      System.out.println("Palabra invertia: "+ palabraInvertia);
    }
    /*private boolean determinarVocal (char caractrerDeterminar){
        char c = Character.toLowerCase(caractrerDeterminar);
        if ((c == 'a') || (c=='e')||(c=='i')||(c=='o')||(c=='u')){
            return true;
        }else{
            return false;
        }
    }*/
}
