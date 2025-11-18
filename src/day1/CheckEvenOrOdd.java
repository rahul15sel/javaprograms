package day1;

public class CheckEvenOrOdd {

    public static void main(String arg[])
    {
       if( evenOrOdd(0))

           System.out.println("Number is Even");
       else System.out.println("Number is odd");
    }

    private static boolean evenOrOdd(int num){

        boolean result=false;
        if(num%2==0)
            return true;
        else return false;

    }
}
