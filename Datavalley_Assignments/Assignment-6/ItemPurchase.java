import java.util.Scanner;

public class ItemPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of items purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total cost without any discount
        double totalCost = quantity * pricePerItem;

        // Apply discount based on the quantity purchased
        double discountPercentage = 0.0;
        if (quantity > 50) {
            discountPercentage = 0.1; // 10% discount for quantity > 50
        } else if (quantity >= 25 && quantity <= 50) {
            discountPercentage = 0.05; // 5% discount for quantity between 25 and 50 (inclusive)
        } else {
            discountPercentage = 0.0; // No discount for quantity < 25
        }

        // Calculate discount amount
        double discountAmount = totalCost * discountPercentage;

        // Calculate total expenses after applying discount
        double totalExpenses = totalCost - discountAmount;

        // Display the results
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("Discount Applied: " + (discountPercentage * 100) + "%");
        System.out.println("Discount Amount: ₹" + discountAmount);
        System.out.println("Total Expenses (after discount): ₹" + totalExpenses);

        scanner.close();
    }
}
