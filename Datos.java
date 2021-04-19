import java.util.regex.Pattern;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class Datos {
    public static int contarCaracteres(String text){
        int caracteresEncontrados = 0;
        String regEx = "^[a-zA-Z0-9]$";
        for(int i = 0; i<text.length();i++){
            if(Pattern.matches(regEx, text.substring(i,i+1))){
                caracteresEncontrados+=1;
            }
            
        }
        return caracteresEncontrados;
    }
    
}