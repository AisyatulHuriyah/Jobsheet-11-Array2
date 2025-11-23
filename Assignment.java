import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Enter answers for Respondent : " + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("The Score for Question " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Average for each respondent ---");
        for (int i = 0; i < survey.length; i++) {
            double total = 0;
            for (int j = 0; j < survey[i].length; j++) {
                total += survey[i][j];
            }
            double average = total / survey[i].length;
            System.out.printf("Respondent %d: %.2f\n" + (i + 1)+ average);
        }

        System.out.println("\n--- Average for each Questions ---");
        for (int j = 0; j < survey[0].length; j++) {
            double total = 0;
            for (int i = 0; i < survey.length; i++) {
                total += survey[i][j];
            }
            double average = total / survey.length;
            System.out.printf("Questions %d: %.2f\n" + (j + 1) + average);
        }

        double overallTotal = 0;
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                overallTotal += survey[i][j];
            }
        }
        double overallAverage = overallTotal / (survey.length * survey[0].length);
        System.out.printf("\nOverall Average: %.2f\n", overallAverage);
    }
}