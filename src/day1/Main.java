package day1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0]=90;
        arr[1]=20;
        arr[2]=20;
        arr[2]=20;
        arr[4]=20;
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println("Average of array=="+avg);

    }
}