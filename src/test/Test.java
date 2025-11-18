package test;

public class Test {
    public static void main(String[] args) {


        int rows = 3;

        for (int i = 0; i < rows; i++) {
            // print spaces
            for (int j = i; j < rows - 1; j++) {
                System.out.print(" ");
            }

            // print stars (1, 3, 5, ...)
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
