import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double w = data[i][0], h = data[i][1] / 100;
            data[i][2] = w / (h * h);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] s = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double b = data[i][2];
            if (b < 18.5) s[i] = "Underweight";
            else if (b < 24.9) s[i] = "Normal weight";
            else if (b < 29.9) s[i] = "Overweight";
            else s[i] = "Obese";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] d = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            d[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            d[i][1] = sc.nextDouble();
        }
        calculateBMI(d);
        String[] status = determineBMIStatus(d);
        System.out.println("\nPerson\tWeight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++)
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n", i + 1, d[i][0], d[i][1], d[i][2], status[i]);
        sc.close();
    }
}