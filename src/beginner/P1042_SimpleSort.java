package beginner;

import java.util.Scanner;
import java.util.Arrays;

public class P1042_SimpleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        int[] original = Arrays.copyOf(nums, 3);

        Arrays.sort(nums);

        for (int n : nums) System.out.println(n);

        System.out.println();

        for (int n : original) System.out.println(n);

        sc.close();
    }
}