import java.util.Scanner;

public class TotalNumberOfVowelsPresent {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = inputScanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive check

        int countOfVowels = 0;
        boolean hasVowels = false;

        for (char ch : userInput.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countOfVowels++;
                hasVowels = true;
            }
        }
        inputScanner.close();

        if (hasVowels) {
            System.out.println("Vowels present in given string: Yes");
            System.out.println("Number of vowels in the string: " + countOfVowels);
        } else {
            System.out.println("Vowels present: No");
        }
    }
}
