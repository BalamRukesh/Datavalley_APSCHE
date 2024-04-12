import java.util.Scanner;

public class DivisibilityChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 7 and 13
        boolean isDivisibleBy7 = (number % 7 == 0);
        boolean isDivisibleBy13 = (number % 13 == 0);

        if (isDivisibleBy7 && isDivisibleBy13) {
            System.out.println(number + " is divisible by both 7 and 13.");

            // Calculate quotient and remainder when divided by 7
            int quotientBy7 = number / 7;
            int remainderBy7 = number % 7;

            // Calculate quotient and remainder when divided by 13
            int quotientBy13 = number / 13;
            int remainderBy13 = number % 13;

            // Display quotient and remainder for both divisions
            System.out.println("Quotient when divided by 7: " + quotientBy7);
            System.out.println("Remainder when divided by 7: " + remainderBy7);
            System.out.println("Quotient when divided by 13: " + quotientBy13);
            System.out.println("Remainder when divided by 13: " + remainderBy13);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }

        scanner.close();
    }
}
