package basics.hashing;

import java.util.Arrays;

public class HashingUsingArraysOptimized {

    private static void hashing(int[] arr) {
        int[] freq = new int[3];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        System.out.println(Arrays.toString(freq));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        hashing(arr);
    }
}