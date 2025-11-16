package test;

public class CountNumbers {
    public static void main(String[] args) {
        int num=373477;
        int total=countDigits(num);
        System.out.println("Number of Digits="+total);
    }

    private static int countDigits(int num) {
        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
           // num=num/10;
        }
        return count;
    }
}

