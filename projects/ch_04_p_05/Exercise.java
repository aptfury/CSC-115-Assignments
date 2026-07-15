import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String valid = "%s is a valid social security number";
        String invalid = "%s is an invalid social security number";

        System.out.println("Enter a string for SSN: ");
        String ssn = input.next();

        boolean isValid = ssn.length() == 11;

        if (isValid) {
            boolean validDashes = ssn.charAt(3) == '-' && ssn.charAt(6) == '-';
            boolean validDigits =
                    Character.isDigit(ssn.charAt(0)) &&
                    Character.isDigit(ssn.charAt(1)) &&
                    Character.isDigit(ssn.charAt(2)) &&
                    Character.isDigit(ssn.charAt(4)) &&
                    Character.isDigit(ssn.charAt(5)) &&
                    Character.isDigit(ssn.charAt(7)) &&
                    Character.isDigit(ssn.charAt(8)) &&
                    Character.isDigit(ssn.charAt(9)) &&
                    Character.isDigit(ssn.charAt(10));

            isValid = validDashes && validDigits;
        }

        if (isValid) {
            System.out.printf(valid, ssn);
        }
        else {
            System.out.printf(invalid, ssn);
        }
    }
}