public class PrintLinearlyNTo1Striver {

    private static void print(int i, int n) {
        if (n < i) {
            return;
        }
        System.out.println(n);
        print(i, n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        print(1, n);
    }
}