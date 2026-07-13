import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // init input
        Scanner input = new Scanner(System.in);

        double num = 0;

        // user input
        System.out.println("Enter a decimal value (0 to 15): ");
        num = input.nextDouble();

        // logic
        if (num >= 0 && num <= 15) {
            if (num <= 9) {
                System.out.println("The hex value is " + ((int) num));
            }
            else {
                System.out.println("The hex value is " + (char) ('A' + (num - 10)));
            }
        }
        else {
            System.out.println(num + " is an invalid input");
        }
    }
}