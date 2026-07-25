import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String entry = input.nextLine().toUpperCase();

        int totalVowels = 0;
        int totalConsonants = 0;

        for (int i = 0; i < entry.length(); i++) {
            char c = entry.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    totalVowels++;
                }
                else {
                    totalConsonants++;
                }
            }
        }

        System.out.println("The number of vowels is " + totalVowels);
        System.out.println("The number of consonants is " + totalConsonants);
    }
}