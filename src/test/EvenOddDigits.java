package test;

public class EvenOddDigits {
    public static void main(String[] args) {
        int num=474763636;
        evenOddDigits(num);
    }

    private static void evenOddDigits(int num) {
        int evenDigits=0;
        int oddDigits=0;
        while(num>0)
        {
            int lastDigit=num%10;
            if(lastDigit%2==0)
            {
                evenDigits++;
            }
            else{
                oddDigits++;
            }
            num=num/10;
        }
        System.out.println("Even Digits="+evenDigits);
        System.out.println("Odd Digits="+oddDigits);
    }
}
