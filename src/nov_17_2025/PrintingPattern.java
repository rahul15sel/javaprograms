package nov_17_2025;

public class PrintingPattern {
    public static void main(String[] args) {
        /* Print a triagular pattern like below
         *
         * * *
         * * * * *

         */
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
