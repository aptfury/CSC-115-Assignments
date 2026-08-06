import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.printf("The mean is %.2f%n", mean(numbers));
        System.out.printf("The standard deviation is %.5f%n", deviation(numbers));
    }

    public static double mean(double[] numbers) {
        double sum = 0;
        for (double val : numbers) {
            sum += val;
        }
        return sum / numbers.length;
    }

    public static double deviation(double[] numbers) {
        double value = mean(numbers);
        double sum = 0;

        for (double val : numbers) {
            sum += Math.pow(val - value, 2);
        }

        return Math.sqrt(sum / (numbers.length - 1));
    }
}