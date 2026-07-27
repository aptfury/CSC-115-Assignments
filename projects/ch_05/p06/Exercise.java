import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN number as a string: ");
        String isbn = input.next();

        int x = 0;

        if (isbn.length() < 12 || isbn.length() > 12) {
            System.out.println("97801320 is an invalid input");
        }
        else {
            for (int i = 0; i < isbn.length(); i++) {
                int y = Character.getNumericValue(isbn.charAt((i)));

                if ((i + 1) == 10) {
                    x += (3 * y * 10);
                }
                else if ((i + 1) % 2 == 0) {
                    x += (3 * y);
                }
                else {
                    x += y;
                }
            }

            int checksum = 10 - x % 10;

            if (checksum == 10) {
                checksum = 0;
            }

            isbn += "" + checksum;

            System.out.println("The ISBN-13 number is " + isbn);
        }
    }
}