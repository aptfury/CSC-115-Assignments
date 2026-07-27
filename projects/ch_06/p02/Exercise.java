public class Exercise {
    public static void main(String[] args) {
        System.out.println("i                 m(i)");

        for (double i = 1.0; i <= 20.0; i++) {
            System.out.printf("%d                 %.4f%n", (int)i, m(i));
        }
    }

    public static double m(double i) {
        double sum = 0.0;
        for (double k = 1.0; k <= i; k++) {
            sum += k / (k + 1.0);
        }
        return sum;
    }
}