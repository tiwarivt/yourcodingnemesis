package basics.hashing;

public class FreqOfEachElement {
    private static void hashing(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        System.out.println("# of 0's: " + zero
                + "\n# of 1's: " + one
                + "\n# of 2's: " + two);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        hashing(arr);
    }
}