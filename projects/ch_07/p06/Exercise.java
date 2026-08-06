public class Exercise {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.printf("The total is %d", sum);
    }
}