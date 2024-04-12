public class PriningtOddPositionChars {

    public static void main(String[] args) {
        String text = "type here to search";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is not a whitespace and the index is odd 
            if (!Character.isWhitespace(ch) && i % 2 != 0) {
                System.out.print(ch);
            }
        }
    }
}