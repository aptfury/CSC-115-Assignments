import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter a character: ");
        char a = input.next().charAt(0);

        System.out.println(a + " appears in " + str + " " + count(str, a) + " times");
    }

    public static int count(String str, char a) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == a) {
                counter++;
            }
        }

        return counter;
    }
}