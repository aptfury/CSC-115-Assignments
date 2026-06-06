import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);

        // get dollar amount from user
        System.out.print("Enter an amount in double, for example, 11.56: ");
        double total = input.nextDouble();

        // calculate cents
        int cents = (int)(total * 100);

        // calculate dollars
        int dollars = cents / 100;
        int remainder = cents % 100;

        // calculate quarters
        int quarters = remainder / 25;
        remainder = remainder % 25;

        // calculate dimes
        int dimes = remainder / 10;
        remainder = remainder % 10;

        // calculate nickels
        int nickels = remainder / 5;
        remainder = remainder % 5;

        // calculate pennies
        int pennies = remainder;

        // Display results
        System.out.println("Your amount " + total + " consists of");
        System.out.println("    " + dollars + " dollars");
        System.out.println("    " + quarters + " quarters");
        System.out.println("    " + dimes + " dimes");
        System.out.println("    " + nickels + " nickels");
        System.out.println("    " + remainder + " pennies");
    }
}