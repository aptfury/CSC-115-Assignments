import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Enter the width: ");
        int width = input.nextInt();

        System.out.println("The formatted number is " + format(number, width));
    }

    public static String format(int number, int width) {
        String formattedNumber = "";

        for (int i = 1; i <=(width - String.valueOf(number).length()); i++) {
            formattedNumber += "" + 0;
        }

        formattedNumber += "" + number;

        return formattedNumber;
    }
}