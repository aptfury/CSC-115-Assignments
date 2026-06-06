import java.util.Scanner;

public class TotalWithGratuity {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);

        // get initial cost and gratuity
        System.out.print("Cost and gratuity: ");
        double cost = input.nextDouble();
        double gratuity = input.nextDouble() / 100;
        double totalGratuity = cost * gratuity;
        double totalCost = cost + totalGratuity;

        // display gratuity and totals
        System.out.println("The gratuity is $" + totalGratuity + " and the total is $" + totalCost);
    }
}