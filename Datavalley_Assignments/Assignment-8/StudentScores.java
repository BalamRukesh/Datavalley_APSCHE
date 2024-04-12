import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        //student scores from user
        System.out.print("Enter number of students: ");
        int numberOfStudents = inputScanner.nextInt();
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades.add(inputScanner.nextInt());
        }

        // Calculating average score
        double totalSum = 0;
        for (int grade : grades) {
            totalSum += grade;
        }
        double averageGrade = totalSum / grades.size();

        // Count and calculating median for each group --above, average, below
        int aboveCount = 0, atAverageCount = 0, belowCount = 0;
        ArrayList<Integer> aboveGrades = new ArrayList<>();
        ArrayList<Integer> atAverageGrades = new ArrayList<>();
        ArrayList<Integer> belowGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade > averageGrade) {
                aboveCount++;
                aboveGrades.add(grade);
            } else if (grade == averageGrade) {
                atAverageCount++;
                atAverageGrades.add(grade);
            } else {
                belowCount++;
                belowGrades.add(grade);
            }
        }

        // Calculating median for each group 
        double aboveMedian = 0, atAverageMedian = 0, belowMedian = 0;
        if (aboveCount > 0) {
            Integer[] aboveArray = aboveGrades.toArray(new Integer[aboveCount]);
            Arrays.sort(aboveArray);
            aboveMedian = aboveArray[aboveCount / 2];
            if (aboveCount % 2 == 0) {
                aboveMedian = (aboveMedian + aboveArray[(aboveCount / 2) - 1]) / 2.0;
            }
        }
        if (atAverageCount > 0) {
            atAverageMedian = averageGrade;
        }
        if (belowCount > 0) {
            Integer[] belowArray = belowGrades.toArray(new Integer[belowCount]);
            Arrays.sort(belowArray);
            belowMedian = belowArray[belowCount / 2];
            if (belowCount % 2 == 0) {
                belowMedian = (belowMedian + belowArray[(belowCount / 2) - 1]) / 2.0;
            }
        }

        // Printing results
        System.out.println("\nNumber of students above average: " + aboveCount);
        if (aboveCount > 0) {
            System.out.println("Median grade for students above average: " + aboveMedian);
        }
        System.out.println("\nNumber of students at average: " + atAverageCount);
        if (atAverageCount > 0) {
            System.out.println("Median grade for students at average: " + atAverageMedian);
        }
        System.out.println("\nNumber of students below average: " + belowCount);
        if (belowCount > 0) {
            System.out.println("Median grade for students below average: " + belowMedian);
        }

        inputScanner.close();
    }
}
