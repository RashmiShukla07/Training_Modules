import java.util.*;

public class Map_q3 {
    public static void frequency(String inputStr){
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        //string to char array
        char[] strArray = inputStr.toCharArray();

        for(char c: strArray){
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }
            else{
                charMap.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.println(entry.getKey()+"= "+entry.getValue());
        }
    }
    public static void main(String[] args){
        String str = "believe in youself";
        frequency(str.replaceAll("\\s", ""));
        
    }

}
