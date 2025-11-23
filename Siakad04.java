import java.util.Scanner;

public class Siakad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int student = sc.nextInt();

        System.out.print("Enter number of courses: ");
        int course = sc.nextInt();
        sc.nextLine();

        String[] courseNames = new String[course];
        System.out.println("\nEnter course names:");
        for (int j = 0; j < course; j++) {
            System.out.print("Course " + (j + 1) + ": ");
            courseNames[j] = sc.nextLine();
        }

        int[][] score = new int[student][course];

        for (int i = 0; i < student; i++) {
            System.out.println("Enter scores for student #" + (i+1));
            double sumForEachStudent = 0;

            for (int j = 0; j < course; j++) {
                System.out.print("Course #" + (j + 1) + " score : ");
                score[i][j] = sc.nextInt();
                sumForEachStudent += score[i][j];
            }

            System.out.println("Average score: " + sumForEachStudent / course);
        }

        System.out.println("\n====================================");
        System.out.println("      Average Score per Course      ");
        System.out.println("====================================");

        for (int j = 0; j < course; j++) {
            double sumForEachCourse = 0;

            for (int i = 0; i < student; i++) {
                sumForEachCourse += score[i][j];
            }

            System.out.println("Course " + (j + 1) + ": " + (sumForEachCourse / student));
        }
        System.out.println("\nProgram finished successfully.");
    }
}