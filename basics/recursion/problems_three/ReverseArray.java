package basics.recursion.problems_three;

import java.util.Arrays;

//print array in reverse order:
/*
 * 
 public class ReverseArray {
     
     public static void revArray(int[] arr, int n) {
         if (n < 0) {
            return;
        }
        System.out.println(arr[n]);
        revArray(arr, n-1);
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 1, 9 };
        int n = arr.length - 1;
        revArray(arr, n);
    }
}
*/

//reverse an array using two pointers
public class ReverseArray {

    public static int[] revArray(int[] arr, int i, int n) {
        if (i >= n) {
            return arr;
        }
        if (i <= n) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        return revArray(arr, i + 1, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 9, 9, 11 };
        // int[] arr = { 1, 1, 9, 9, 11, 2009 };
        System.out.println(Arrays.toString(revArray(arr, 0, arr.length - 1)));
    }
}