import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount invested: ");
        double amount = input.nextDouble();

        System.out.println("Annual interest rate: ");
        double interest = input.nextDouble();

        printTotals(amount, ((interest / 100) / 12));
    }

    public static double total(double amount, double interest, int years) {
        double totalInterest = Math.pow((1 + interest), (years * 12));

        return amount * totalInterest;
    }

    public static void printTotals(double amount, double interest) {
        System.out.println("Years             Future Value");

        for (int i = 1; i <= 30; i++) {
            if (i < 10) {
                System.out.printf("%d                 %.2f%n", i, total(amount, interest, i));
            }
            else {
                System.out.printf("%d                %.2f%n", i, total(amount, interest, i));
            }
        }
    }
}