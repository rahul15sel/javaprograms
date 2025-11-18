package test;

public class FibbbonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        // Print the first number manually
        System.out.print(first + ",");

        for (int i = 1; i < 10; i++) {
            int next = first + second;
            System.out.print(next + ",");
            first = second;
            second = next;
        }
    }
}

