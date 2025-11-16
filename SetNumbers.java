package test;

import java.util.HashSet;
import java.util.Set;

public class SetNumbers {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(null);

        System.out.println(set);

    }
}
