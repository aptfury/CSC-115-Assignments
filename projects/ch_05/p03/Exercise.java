import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int students = input.nextInt();

        String name1 = "";
        int score1 = 0;

        String name2 = "";
        int score2 = 0;

        for (int i = 1; i <= students; i++) {
            System.out.println("Enter a student name: ");
            String name = input.next();

            System.out.println("Enter a student score: ");
            double score = input.nextDouble();

            if (score > score1) {
                name2 = name1;
                score2 = score1;

                name1 = name;
                score1 = (int) score;
            }
            else if (score > score2) {
                name2 = name;
                score2 = (int) score;
            }
        }

        System.out.println("Top two students:");
        System.out.println(name1 + "'s score is " + score1);
        System.out.println(name2 + "'s score is " + score2);
    }
}