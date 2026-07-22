import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0: ");

        double total = 0;
        double average = 0;
        int i = 0;
        int pos = 0;
        int neg = 0;
        boolean moreNumbers = true;

        while (moreNumbers) {
            double num = input.nextDouble();

            if (num == 0) {
                moreNumbers = false;
            }
            else {
                if (num > 0) {
                    pos++;
                }
                else {
                    neg++;
                }

                total += num;
                i++;
            }
        }

        if (total == 0 && i == 0) {
            System.out.println("No numbers are entered except 0");
        }
        else {
            average = total / i;

            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }


    }
}