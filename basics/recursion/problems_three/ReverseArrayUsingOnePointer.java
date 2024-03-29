package basics.recursion.problems_three;

import java.util.Arrays;

public class ReverseArrayUsingOnePointer {

    private static int[] revArray(int i, int[] arr) {
        int n = arr.length - 1;
        if (i >= n / 2) {
            return arr;
        }
        if (i < n - i) {
            int temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }
        return revArray(i + 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 199 };
        System.out.println(Arrays.toString(revArray(0, arr)));
    }
}