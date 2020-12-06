package AoC;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.Integer.parseInt;

public class Password {
    public static void main(String[] args) {
        dag2();
    }

     public static int countd1(char character, String string) {
        int amount = 0;
         for(char ch: string.toCharArray()){
             if(ch == character){
                 amount++;
             }
         }
         return amount;
     }
     
     public static boolean countd2(char character, String string, int x, int y){
        char[] charray = string.toCharArray();
            if ((charray[x-1] == character) && (charray[y-1] != character)){
                return true;
            } else if ((charray[x-1] != character) && (charray[y-1] == character)){
                return true;
            }
        return false;
     }
     
     public static boolean checker(String string, int part){
         Pattern pNumber = Pattern.compile("[^\\d]*([\\d]+)[^\\d]+([\\d]+)");
         Pattern pString = Pattern.compile("[^a-z]*([a-z]+)[^a-z]*([a-z]+)");
         Matcher mNumber = pNumber.matcher(string);
         Matcher mString = pString.matcher(string);
         if (mNumber.find() && mString.find()) {
             int min = parseInt(mNumber.group(1));
             int max = parseInt(mNumber.group(2));
             String one = mString.group(1);
             String two = mString.group(2);
             if (part == 1){
                 int countos = countd1(one.charAt(0), two);
                 if (min <= countos && countos <= max) {
                     return true;
                 }
             }
             if (part == 2){
                 boolean bol = countd2(one.charAt(0), two, min, max);
                  if (bol) {
                      return true;
                  }
             }
         }
         return false;
     }


     
     
     public static void mon(List<String> list){
        int badpwd1 = 0;
        int badpwd2 = 0;
        for (String string: list) {
            if (checker(string, 1)){badpwd1 ++;}
            if (checker(string, 2)){badpwd2 ++;}
        }
         System.out.println(badpwd1);
        System.out.println(badpwd2);
     }
    
     public static void dag2(){
         List<String> list = ReadPuzzle.readPuzzle("d2.txt");
         mon(list);
     }
}
