import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] entries = collectEntries(input);
        int[] nums = collectNums(entries);
        int[] counts = collectCounts(entries, nums);
        printResults(nums, counts);
    }

    public static int[] collectEntries(Scanner input) {
        System.out.println("Enter integers between 1 and 100, inclusive: ");

        int[] temp = new int[1000];
        int i = 0;
        boolean active = true;

        while (active) {
            int entry = input.nextInt();

            if (entry == 0) {
                active = false;
            }
            else {
                temp[i] = entry;
                i++;
            }
        }

        int[] entries = new int[i];
        for (int j = 0; j < i; j++) {
            entries[j] = temp[j];
        }

        return entries;
    }

    public static int[] collectNums(int[] entries) {
        java.util.Arrays.sort(entries);
        int totalNums = 0;

        for (int i = 0; i < entries.length; i++) {
            if (i == 0 || entries[i] != entries[i - 1]) {
                totalNums++;
            }
        }

        int[] nums = new int[totalNums];
        int currIndex = 0;

        for (int i = 0; i < entries.length; i++) {
            if (i == 0 || entries[i] != entries[i - 1]) {
                nums[currIndex] = entries[i];
                currIndex++;
            }
        }

        return nums;
    }

    public static int[] collectCounts(int[] entries, int[] nums) {
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < entries.length; j++) {
                if (nums[i] == entries[j]) {
                    counts[i]++;
                }
            }
        }
        return counts;
    }

    public static void printResults(int[] nums, int[] counts) {
        String res = "%d occurs %d %s%n";
        for (int i = 0; i < nums.length; i++) {
            String word = (counts[i] == 1) ? "time" : "times";
            System.out.printf(res, nums[i], counts[i], word);
        }
    }
}