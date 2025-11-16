package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String str="this string is required to evaluate";
        char[] charStr=str.toCharArray();
        Map<Character, Integer> map=new TreeMap<>();
        for(int i=0;i<charStr.length;i++)
        {
            if(!map.containsKey(charStr[i]))
                map.put(charStr[i],1);
            else
                map.put(charStr[i],map.get(charStr[i])+1);
        }
        System.out.print(map);


    }

}
