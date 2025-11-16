package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharacterCountAscending {

    // Automation - 1. Count characters 2. Print characters in sorting order
    public static void main(String[] args) {

        String str="Automation";
        char[] charArr=str.toCharArray();
        Map<Character, Integer> map=new TreeMap<>();

        for(int i=0;i<charArr.length;i++)
        {
            if(!map.containsKey(charArr[i]))
            {
                map.put(charArr[i],1);
            }
            else
                map.put(charArr[i], map.get(charArr[i])+1);
        }

        System.out.print(map);

    }
}
