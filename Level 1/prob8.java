import java.util.Scanner;

class prob8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double userKm = input.nextDouble();
        double userMiles = userKm / 1.6;
        System.out.println("The total miles is " + userMiles + " mile for the given " + userKm + " km");
        input.close();
    }
}
