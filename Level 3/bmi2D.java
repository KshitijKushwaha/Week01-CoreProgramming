import java.util.Scanner;

public class bmi2D {
    public static String[][] computeBMIStatus(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double h = data[i][0], w = data[i][1], bmi = w / Math.pow(h / 100.0, 2);
            String status = bmi <= 18.4 ? "Underweight" : bmi <= 24.9 ? "Normal" : bmi <= 39.9 ? "Overweight" : "Obese";
            result[i][0] = String.format("%.2f", h);
            result[i][1] = String.format("%.2f", w);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayBMIData(String[][] data) {
        System.out.printf("\n%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : data)
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
            input[i][0] = sc.nextDouble();
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            input[i][1] = sc.nextDouble();
        }
        displayBMIData(computeBMIStatus(input));
        sc.close();
    }
}
