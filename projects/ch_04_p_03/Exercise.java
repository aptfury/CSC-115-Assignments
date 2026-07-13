import java.util.Scanner;
import java.lang.Character;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vowels = "aeiou";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Enter a letter: ");
        String letter = input.next();

        if (alphabet.contains(letter.toLowerCase())) {
            if (vowels.contains(letter.toLowerCase())) {
                System.out.println(letter + " is a vowel");
            }
            else {
                System.out.println(letter + " is a consonant");
            }
        }
        else {
            System.out.println(letter + " is an invalid input");
        }
    }
}