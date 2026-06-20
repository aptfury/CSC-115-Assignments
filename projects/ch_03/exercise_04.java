import java.util.Scanner;
import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<String>();
        days.add(0, "Saturday");
        days.add(1, "Sunday");
        days.add(2, "Monday");
        days.add(3, "Tuesday");
        days.add(4, "Wednesday");
        days.add(5, "Thursday");
        days.add(6, "Friday");

        System.out.println("Enter year: (e.g., 2012): ");
        int $y = input.nextInt();

        System.out.println("Enter month: 1-12: ");
        int $m = input.nextInt();

        System.out.println("Enter the day of the month: ");
        int $q = input.nextInt();

        if ($m == 1) {
            $m = 13;
            $y--;
        }
        else if ($m == 2) {
            $m = 14;
            $y--;
        }
        else {
            $m = $m;
        }

        int $k = $y % 100;
        int $j = $y / 100;

        int $h = ($q + ((26 * ($m + 1)) / 10) + $k + ($k / 4) + ($j / 4) + (5 * $j)) % 7;

        System.out.println("Day of the week is " + days.get($h));
    }
}