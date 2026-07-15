import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month: ");
        String month = input.next();

        switch (month) {
            case "Jan":
                System.out.printf("%d %s has %d days", year, month, 31);
                break;

            case "Feb":
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.printf("%d %s has %d days", year, month, 29);
                }
                else {
                    System.out.printf("%d %s has %d days", year, month, 28);
                }
                break;

            case "Mar":
                System.out.printf("%d %s has %d days", year, month, 31);
                break;

            case "Apr":
                System.out.printf("%d %s has %d days", year, month, 30);
                break;

            case "May":
                System.out.printf("%d %s has %d days", year, month, 31);
                break;

            case "Jun":
                System.out.printf("%d %s has %d days", year, month, 30);
                break;

            case "Jul":
                System.out.printf("%d %s has %d days", year, month, 31);
                break;

            case "Aug":
                System.out.printf("%d %s has %d days", year, month, 31);
                break;

            case "Sep":
                System.out.printf("%d %s has %d days", year, month, 30);
                break;

            case "Oct":
                System.out.printf("%d %s has %d days", year, month, 31);
                break;

            case "Nov":
                System.out.printf("%d %s has %d days", year, month, 30);
                break;

            case "Dec":
                System.out.printf("%d %s has %d days", year, month, 31);
                break;

            default:
                System.out.printf("%s is not a correct month name", month);
        }
    }
}