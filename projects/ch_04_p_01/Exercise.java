import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // init input
        Scanner input = new Scanner(System.in);

        // variables
        double sides = 0;
        double length = 0;
        double area = 0;

        // user inputs
        System.out.println("Enter the number of sides: ");
        sides = input.nextDouble();

        System.out.println("Enter the length of a side: ");
        length = input.nextDouble();

        // logic
        area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));

        System.out.println("The area of the polygon is " + area);
    }
}