import java.util.Scanner;

public class percent2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + " marks: ");
                marks[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentages[i] > 80) grades[i] = "A";
            else if (percentages[i] > 70) grades[i] = "B";
            else if (percentages[i] > 60) grades[i] = "C";
            else if (percentages[i] > 50) grades[i] = "D";
            else if (percentages[i] > 40) grades[i] = "E";
            else grades[i] = "R";
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\nPercentage of student %d is %.2f and grade is %s.", (i + 1), percentages[i], grades[i]);
        }

        scanner.close();
    }
}
