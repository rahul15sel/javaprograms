package day1;

public class StringOperations {

    public static void main(String arg[])
    {
        String abc="Rahul";
        System.out.println(abc.length());
        System.out.println(abc.toLowerCase());
        System.out.println(abc.toUpperCase());
        for(int i=0;i<abc.length();i++)
        {
            System.out.println("Character Parsing in String"+abc.charAt(i));
        }
    }
}
