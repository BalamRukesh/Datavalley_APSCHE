public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        String inputString = "This is rukesh";
        int vowelCount = 0;
        int consonantCount = 0;

        inputString = inputString.toLowerCase(); // Converting to lowercase for better understanding of case sensitivity

        for (char character : inputString.toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("The string '" + inputString + "' has " + vowelCount + " vowels and " + consonantCount + " consonants.");
    }
}
