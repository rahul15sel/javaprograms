package test;

import java.util.ArrayList;
import java.util.List;

public class ListNumbers {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(5);
        ls.add(6);
        for(int i=0;i<ls.size();i++)
            System.out.println(ls.get(i));


    }
}
