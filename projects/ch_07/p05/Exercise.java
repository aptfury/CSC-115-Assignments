import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = getListSize(input);
        int[] nums = getList(input, size);
        boolean sorted = isSorted(nums);

        String listRes = "The list has %d integers: ";

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                listRes += "" + nums[i] + "%n";
            }
            else {
                listRes += "" + nums[i] + " ";
            }
        }

        System.out.printf(listRes, size);
        System.out.println("This list is " + (sorted ? "already sorted" : "not sorted"));
    }

    public static int getListSize(Scanner input) {
        System.out.println("Enter the size of the list: ");

        return input.nextInt();
    }

    public static int[] getList(Scanner input, int size) {
        int[] nums = new int[size];
        System.out.println("Enter the content of the list: ");

        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        return nums;
    }

    public static boolean isSorted(int[] nums) {
        int last = 0;
        boolean sorted = false;

        for (int x : nums) {
            if (last == 0) {
                last = x;
            }
            else if (last < x) {
                sorted = true;
                last = x;
            }
            else {
                sorted = false;
                break;
            }
        }

        return sorted;
    }
}