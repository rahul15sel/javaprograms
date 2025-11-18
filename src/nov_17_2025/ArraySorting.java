package nov_17_2025;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 1, 5, 6};

        // What to do: Sort the array in ascending order using bubble sort false commit
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1] just for commit
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array no code commit
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
