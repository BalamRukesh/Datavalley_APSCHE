import java.util.Scanner;

public class LateFeeCalculatorLibrary {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter number of book: ");
        int numberOfbooks = inputScanner.nextInt();
      
        System.out.print("Enter number of days late for book return: ");
        int numberOfDaysLate = inputScanner.nextInt();
        inputScanner.close();

        if (numberOfDaysLate > 21) {
            System.out.println("Membership cancelled due to late return of book.");
        } else {
            double fineAmount;
            if (numberOfDaysLate <= 7) {
                fineAmount = numberOfDaysLate * 0.5; 
            } else if (numberOfDaysLate <= 14) {
                fineAmount = 1.0; 
            } else {
                fineAmount = 5.0; 
            }
            System.out.println("Total fine :₹" + (fineAmount*numberOfbooks));
        }
    }
}
