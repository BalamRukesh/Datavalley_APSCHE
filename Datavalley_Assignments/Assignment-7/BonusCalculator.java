

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currentYear = inputScanner.nextInt();

        System.out.print("Enter year of employment: ");
        int employmentYear = inputScanner.nextInt();

        int yearsOfService = currentYear - employmentYear;
        inputScanner.close();

        if (yearsOfService > 5) {
            System.out.println("Bonus awarded: ₹ 5000");
        } else if (yearsOfService >= 3) {
            System.out.println("Bonus awarded: ₹ 3000");
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}
