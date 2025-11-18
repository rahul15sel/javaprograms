package test;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,8,10};
        checkEven(arr);
    }

    private static void checkEven(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }

        }
    }
}
