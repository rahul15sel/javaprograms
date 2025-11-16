package test;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "A3B4C6";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);            // Get the character (A, B, C)
            int count = Character.getNumericValue(str.charAt(i + 1));  // Get the number (3, 4, 6)

            // Append the character 'count' times
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
