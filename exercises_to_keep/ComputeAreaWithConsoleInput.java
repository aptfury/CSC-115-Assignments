import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // compute area
        double area = radius * radius * 3.14159;

        // report area
        System.out.println("The area of circle of radius " +
                radius + " is " + area);
    }
}