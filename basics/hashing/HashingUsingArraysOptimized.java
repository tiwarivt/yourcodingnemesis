package basics.hashing;

public class HashingUsingArraysOptimized {

    private static void hashing(int[] arr) {
        //create an array to hash the values of the sample array
        int[] freq = new int[3];
        //store the freq of each element in the hash array
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        //print the frequency of each array element
        for (int i = 0; i < freq.length; i++) {
            System.out.println("# of " + i + "'s: " + freq[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        hashing(arr);
    }
}