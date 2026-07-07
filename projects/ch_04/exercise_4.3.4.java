import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        // request code from user
        System.out.println("");
        int charNum = input.nextInt();

        // convert to character
        char character = (char)charNum;
        boolean isValid = Character.isLetterOrDigit(character);

        if (isValid && (character <= (int)'z')) {
            System.out.println("ASCII - \'" + character + "\'");
        }
        else {
            System.out.println("Unicode - \'" + character + "\'");
        }
    }
}