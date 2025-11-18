package day1;

public class CommonElementsTwoArrays {

    public static void main(String arg[]) {
        int[] arr1 = {0, 4, 6, 8, 10};
        int[] arr2 = {1, 2, 6, 8, 5};

        System.out.println("Common elements between arr1 and arr2:");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break; // Avoid printing duplicates if any
                }
            }
        }
    }
}
