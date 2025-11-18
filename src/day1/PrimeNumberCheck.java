package day1;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        int num=15;
        checkPrime(num);
    }

    private static boolean checkPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // eliminate even numbers
        }
        // Check from 3 to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // divisible by a number other than 1 and itself
            }
        }
        return true;
    }
}
