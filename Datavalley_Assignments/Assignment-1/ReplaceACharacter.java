public class ReplaceACharacter {

    public static String replaceCharacterAtIndex(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", String length: " + str.length());
        }
        char[] chars = str.toCharArray();
        chars[index] = newChar;
        return new String(chars);
    }

    public static void main(String[] args) {
        String originalStr = "Hello, XBox! --- DataValley";
        char replacementChar = 'D';
        int charIndex = 7;

        String modifiedStr = replaceCharacterAtIndex(originalStr, charIndex, replacementChar);
        System.out.println("Original String: " + originalStr);
        System.out.println("Modified String: " + modifiedStr);
    }
}
