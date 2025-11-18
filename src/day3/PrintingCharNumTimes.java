package day3;

public class PrintingCharNumTimes {

    public static void main(String[] args)
    {
        String str = "H5e3l2l2o7";
        int n = 3; // Number of times to print each character
        System.out.println(str);
        for (int i = 0; i < str.length(); i += 2) {
            char character = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                System.out.print(character);
            }

        }

    }
}
