import java.util.Scanner;
import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] entries = collectEntries();
        int[] distinctInts = distinctInts(entries);
        printMsg(distinctInts);
    }

    public static int[] collectEntries() {
        Scanner input = new Scanner(System.in);
        int[] entries = new int[10];

        System.out.println("Enter ten integers: ");

        for (int i = 0; i < entries.length; i++) {
            entries[i] = input.nextInt();
        }

        return entries;
    }

    public static int[] distinctInts(int[] entries) {
        int[] copyEntries = Arrays.copyOf(entries, entries.length);
        Arrays.sort(copyEntries);

        int distinct = 0;

        for (int i = 0; i < copyEntries.length; i++) {
            if (distinct == 0 || copyEntries[i] != copyEntries[i - 1]) {
                distinct++;
            }
        }

        int[] distinctInts = new int[distinct];
        int index = 0;

        for (int i = 0; i < entries.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (entries[i] == entries[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctInts[index++] = entries[i];
            }
        }

        return distinctInts;
    }

    public static void printMsg(int[] distinctInts) {
        System.out.printf("The number of distinct integers is %d%n", distinctInts.length);
        System.out.print("The distinct integers are: ");

        for (int i = 0; i < distinctInts.length; i++) {
            System.out.print((i == (distinctInts.length - 1)) ? distinctInts[i] : distinctInts[i] + " ");
        }
    }
}