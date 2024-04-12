import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookReviews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> booksByRatingRange = new HashMap<>();
        int positiveReviews = 0;
        int neutralReviews = 0;
        int negativeReviews = 0;

        System.out.println("Enter book name or enter 'done' to finish:");
        while (true) {
            System.out.print("Enter book name: ");
            String inputbookname = scanner.nextLine().trim();
            System.out.print("Enter book rating (1-10): ");
            String input = scanner.nextLine().trim();
            if (inputbookname.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int rating = Integer.parseInt(input);
                if (rating < 1 || rating > 10) {
                    System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                    continue;
                }

                if (rating >= 1 && rating <= 5) {
                    booksByRatingRange.put("1-5 stars", booksByRatingRange.getOrDefault("1-5 stars", 0) + 1);
                } else if (rating >= 6 && rating <= 10) {
                    booksByRatingRange.put("6-10 stars", booksByRatingRange.getOrDefault("6-10 stars", 0) + 1);
                }

                if (rating < 3) {
                    negativeReviews++;
                } else if (rating == 3) {
                    neutralReviews++;
                } else {
                    positiveReviews++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid rating or 'done' to finish.");
            }
        }

        System.out.println("\nBook Reviews Analysis:");
        for (String range : booksByRatingRange.keySet()) {
            System.out.println("Number of books rated " + range + ": " + booksByRatingRange.get(range));
        }
        System.out.println("Positive reviews: " + positiveReviews);
        System.out.println("Neutral reviews: " + neutralReviews);
        System.out.println("Negative reviews: " + negativeReviews);

        scanner.close();
    }
}
