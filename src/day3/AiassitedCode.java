package day3;

import java.util.Scanner;

public class AiassitedCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (N): ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i < n) System.out.print(", ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}