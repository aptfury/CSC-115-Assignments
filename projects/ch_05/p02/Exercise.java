import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean active = true;

        int max = 0;
        int count = 0;

        while (active) {
            System.out.println("Enter an integer (0: for end of input): ");
            int num = input.nextInt();

            if (num == 0) {
                active = false;
            }
            else if (num > max) {
                max = num;
                count = 1;
            }
            else if (num == max) {
                count++;
            }
        }

        if (max == 0) {
            System.out.println("No numbers are entered except 0");
        }
        else {
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
        }
    }
}