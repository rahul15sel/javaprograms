package day1;

public class SwapNumbers {

    public static void main(String arg[]) {
        int a = 12;
        int b = 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
// First Logic
    /*    int temp = a + b;
        a = b;
        b = temp - a;
        a = temp - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b); */

        // Second Logic
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
