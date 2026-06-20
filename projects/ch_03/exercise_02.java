import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double $a = input.nextDouble();
        double $b = input.nextDouble();
        double $c = input.nextDouble();
        double $d = input.nextDouble();
        double $e = input.nextDouble();
        double $f = input.nextDouble();

        double $div = ($a * $d) - ($b * $c);

        if ($div == 0) {
            System.out.println("The equation has no solution");
        }
        else {
            double $x = ($e * $d - $b * $f) / $div;
            double $y = ($a * $f - $e * $c) / $div;

            System.out.println("x is " + $x + " and y is " + $y);
        }
    }
}