package test;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharacters {

    // String - Java programming

    public static void main(String[] args) {

        String str = "Java programming";
        char[] strChar = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strChar.length; i++) {

            if (!map.containsKey(strChar[i])) {
                map.put(strChar[i], 1);
            } else {
                map.put(strChar[i], map.get(strChar[i]) + 1);

            }
        }
        System.out.print(map);
        System.out.println();
        for(int i=0;i<strChar.length;i++ )
        {
            if(map.get(strChar[i])>1)
                System.out.print(strChar[i]+","+map.get(strChar[i])+",");

        }

    }

}