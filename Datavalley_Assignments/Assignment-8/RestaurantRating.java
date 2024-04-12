import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> ratingsByRange = new HashMap<>();
        Map<String, Integer> countByRange = new HashMap<>();

        System.out.println("Enter restaurant ratings or enter 'done' to finish:");
        while (true) {
            System.out.print("Enter restaurant name: ");
            String name = scanner.nextLine().trim();
            System.out.print("Enter restaurant rating (1-10): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int rating = Integer.parseInt(input);
                if (rating < 1 || rating > 10) {
                    System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                    continue;
                }

                if (rating >= 1 && rating <= 5) {
                    updateRatingRange("1-5", rating, ratingsByRange, countByRange);
                } else if (rating >= 6 && rating <= 10) {
                    updateRatingRange("6-10", rating, ratingsByRange, countByRange);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid rating or 'done' to finish.");
            }
        }

        System.out.println("\nRestaurant Ratings Analysis:");
        for (String range : ratingsByRange.keySet()) {
            int totalRating = ratingsByRange.get(range);
            int count = countByRange.get(range);
            double averageRating = (double) totalRating / count;
            System.out.println("Number of restaurants rated " + range + ": " + count);
            System.out.println("Average rating for restaurants in range " + range + ": " + averageRating);
        }

        scanner.close();
    }

    private static void updateRatingRange(String range, int rating, Map<String, Integer> ratingsByRange, Map<String, Integer> countByRange) {
        if (ratingsByRange.containsKey(range)) {
            int currentRatingSum = ratingsByRange.get(range);
            int currentCount = countByRange.get(range);
            ratingsByRange.put(range, currentRatingSum + rating);
            countByRange.put(range, currentCount + 1);
        } else {
            ratingsByRange.put(range, rating);
            countByRange.put(range, 1);
        }
    }
}
