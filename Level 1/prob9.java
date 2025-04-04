import java.util.Scanner;


class prob9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Fee: ");
        double userFee = input.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double userDiscountPercent = input.nextDouble();
        double userDiscount = (userFee * userDiscountPercent) / 100;
        double userFinalFee = userFee - userDiscount;
        System.out.println("The discount amount is INR " + userDiscount + " and final discounted fee is INR " + userFinalFee);
        input.close();
    }
}