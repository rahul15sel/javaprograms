package test;

public class SortArray_BubbleSort {

    public static void main(String[] args) {
        int[] arr={9,5,23,45,6,99,8};
        for(int i=0; i<arr.length;i++)
            for(int j=0;j<arr.length-1;j++)
            {

                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        for(int j=0;j<arr.length-1;j++)
            System.out.println(arr[j]);
    }
}
