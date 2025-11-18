package day1;

public class MinNumberArray {

    public static void main(String arg[])
    {
        int[] arr={7,8,9,1,2,5,6,-8,-2};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Minimum number in Array"+min);
    }
}
