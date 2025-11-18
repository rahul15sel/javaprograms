package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForEachLoop {
    public static void main(String[] args) {
        String str = "Rahul";
        char[] strChar = str.toCharArray();
        for (char i : strChar)
            System.out.print(i);
        int[] num = {3, 5, 6, 7, 9, 10};
        for (int j : num)
            System.out.print(j);

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('d');
        set.add('e');
        for (char k : set)
            System.out.print(k);

        Iterator<Character> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }


        }

    }

