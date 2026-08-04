import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = collateStudents(input);
        int best = bestScore(scores);

        printGrades(scores, best);
    }

    public static int[] createList(Scanner input) {
        System.out.println("Enter number of students: ");
        int num = input.nextInt();

        return new int[num];
    }

    public static int[] collateStudents(Scanner input) {
        int[] scores = createList(input);
        System.out.println("Enter " + scores.length + " scores: ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        return scores;
    }

    public static int bestScore(int[] scores) {
        int best = 0;

        for (int i = 0; i < scores.length; i++) {
            if (best < scores[i]) {
                best = scores[i];
            }
        }

        return best;
    }

    public static void printGrades(int[] scores, int best) {
        String res = "Student %d score is %d and grade is %C%n";

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= (best - 10)) {
                System.out.printf(res, i, scores[i], 'A');
            }
            else if (scores[i] >= (best - 20)) {
                System.out.printf(res, i, scores[i], 'B');
            }
            else if (scores[i] >= (best - 30)) {
                System.out.printf(res, i, scores[i], 'C');
            }
            else if (scores[i] >= (best - 40)) {
                System.out.printf(res, i, scores[i], 'D');
            }
            else {
                System.out.printf(res, i, scores[i], 'F');
            }
        }
    }
}