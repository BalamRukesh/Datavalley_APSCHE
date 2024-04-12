import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentProject {
    private String studentName;
    private int completionTime;

    public StudentProject(String studentName, int completionTime) {
        this.studentName = studentName;
        this.completionTime = completionTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getCompletionTime() {
        return completionTime;
    }
}

public class ProjectCompletionAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<StudentProject> projects = new ArrayList<>();

        System.out.println("Enter student projects or press Enter with an empty name to finish:");
        while (true) {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.print("Enter completion time in days: ");
            int completionTime = scanner.nextInt();
            scanner.nextLine(); 
            projects.add(new StudentProject(studentName, completionTime));
        }

        int onTimeCount = 0;
        int lateCount = 0;
        int earlyCount = 0;
        int totalCompletionTime = 0;

        for (StudentProject project : projects) {
            if (project.getCompletionTime() == 7) {
                onTimeCount++;
            } else if (project.getCompletionTime() > 7) {
                lateCount++;
            } else {
                earlyCount++;
            }
            totalCompletionTime += project.getCompletionTime();
        }

        int totalCount = projects.size();
        double averageCompletionTime = (double) totalCompletionTime / totalCount;

        System.out.println("Projects completed on time: " + onTimeCount);
        System.out.println("Projects completed late: " + lateCount);
        System.out.println("Projects completed early: " + earlyCount);
        System.out.println("Average completion time in days: " + averageCompletionTime);

        scanner.close();
    }
}
