import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter time in milliseconds: ");
        long millis = input.nextLong();

        System.out.println(convertMilis(millis));
    }

    public static String convertMilis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = 0;
        long minutes = 0;
        long hours = 0;

        if (totalSeconds > 60) {
            minutes = totalSeconds / 60;
            seconds = totalSeconds % 60;

            if (minutes > 60) {
                hours = minutes / 60;
                minutes %= 60;
            }
        }
        else {
            seconds = totalSeconds;
        }

        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}