import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> ratingsByCategory = new HashMap<>();
        Map<String, Integer> movieCountsByCategory = new HashMap<>();

        System.out.println("Enter movie ratings or enter 'done' to finish:");
        while (true) {
            System.out.print("Enter movie category (e.g: PG, PG-13, R): ");
            String category = scanner.nextLine().toUpperCase();
            if (category.equals("DONE")) {
                break;
            }

            System.out.print("Enter movie rating between(1 to 5): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); 

            if (ratingsByCategory.containsKey(category)) {
                int currentRatingSum = ratingsByCategory.get(category);
                int currentCount = movieCountsByCategory.get(category);
                ratingsByCategory.put(category, currentRatingSum + rating);
                movieCountsByCategory.put(category, currentCount + 1);
            } else {
                ratingsByCategory.put(category, rating);
                movieCountsByCategory.put(category, 1);
            }
        }

        System.out.println("\nMovie Ratings Analysis:");
        for (String category : ratingsByCategory.keySet()) {
            int totalRating = ratingsByCategory.get(category);
            int movieCount = movieCountsByCategory.get(category);
            double averageRating = (double) totalRating / movieCount;
            System.out.println("Category: " + category + " | Number of Movies: " + movieCount + " | Average Rating: " + averageRating);
        }

        scanner.close();
    }
}
