import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount, for example 120000.95: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter number of years as an integer, for example 5: ");
        int numberOfYears = input.nextInt();

        System.out.printf("%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        System.out.println("|---------------|-----------------|---------------|");

        for (double annualRate = 5.0; annualRate <= 8.001; annualRate += 0.125) {
            double monthlyRate = annualRate / 1200;

            double monthlyPayment = loanAmount * monthlyRate /
                    (1 - (1 / Math.pow(1 + monthlyRate, numberOfYears * 12)));

            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-5.3f%%%-18.2f%-18.2f\n",
                    annualRate, monthlyPayment, totalPayment);
        }
    }
}