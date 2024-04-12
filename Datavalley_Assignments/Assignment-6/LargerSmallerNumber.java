import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargerSmallerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

      
        System.out.println("Enter numbers or enter any non-numeric value to finish:");

      
        while (true) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers.add(number); 
            } else {
                break; 
            }
        }

        // Display the largest and smallest numbers
        if (!numbers.isEmpty()) {
            int smallest = numbers.get(0);
            int largest = numbers.get(0);
            int sum = 0;

            for (int number : numbers) {
                if (number < smallest) {
                    smallest = number; 
                }
                if (number > largest) {
                    largest = number; 
                }
                sum += number; 
            }

            // Calculate the average
            double average = (double) sum / numbers.size();

            //results
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}

