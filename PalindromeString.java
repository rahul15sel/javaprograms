package test;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "Malayalyam";  // Corrected spelling
        boolean checkPalindrome = validatePalindrome(str);
        if (checkPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    private static boolean validatePalindrome(String str) {
        String strNormalize = str.toLowerCase();
        int left = 0;
        int right = strNormalize.length() - 1;

        while (left < right) {
            if (strNormalize.charAt(left) != strNormalize.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
