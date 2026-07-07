import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");

        double $x = input.nextDouble();
        double $y = input.nextDouble();

        double xPos = 10.0 / 2.0;
        double xNeg = 0 - xPos;
        double yPos = 5.0 / 2.0;
        double yNeg = 0 - yPos;

        if (($x <= xPos && $x >= xNeg) && ($y <= yPos && $y >= yNeg)) {
            System.out.println("Point (" + $x + ", " + $y + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + $x + ", " + $y + ") is not in the rectangle");
        }
    }
}