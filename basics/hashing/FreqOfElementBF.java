package basics.hashing;

public class FreqOfElementBF {
    private static void hashing(int target, int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                cnt++;
            }
        }
        System.out.println("# of " + target + "'s: " + cnt);
    }

    public static void main(String[] args) {
        int target = 1;
        int[] arr = { 1, 1, 2, 2, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        hashing(target, arr);
    }
}