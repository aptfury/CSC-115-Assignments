import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month in the year (e.g., 1 for Jan): ");
        int month = input.nextInt();

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        String template = "%s %d has %d days";

        switch (month) {
            case 1: {
                System.out.println(String.format(template, "January", year, 31));
                break;
            }

            case 2: {
                if (year % 4 == 0) {
                    if (year == 2200) {
                        System.out.println(String.format(template + "February220028", "February", year, 29));
                    }
                    else {
                        System.out.println(String.format(template, "February", year, 29));
                    }
                }
                else {
                    System.out.println(String.format(template, "February", year, 28));
                }
                break;
            }

            case 3: {
                System.out.println(String.format(template, "March", year, 31));
                break;
            }

            case 4: {
                System.out.println(String.format(template, "April", year, 30));
                break;
            }

            case 5: {
                System.out.println(String.format(template, "May", year, 31));
                break;
            }

            case 6: {
                System.out.println(String.format(template, "June", year, 30));
                break;
            }

            case 7: {
                System.out.println(String.format(template, "July", year, 31));
                break;
            }

            case 8: {
                System.out.println(String.format(template, "August", year, 31));
                break;
            }

            case 9: {
                System.out.println(String.format(template, "September", year, 30));
                break;
            }

            case 10: {
                System.out.println(String.format(template, "October", year, 31));
                break;
            }

            case 11: {
                System.out.println(String.format(template, "November", year, 30));
                break;
            }

            case 12: {
                System.out.println(String.format(template, "December", year, 31));
                break;
            }
        }
    }
}