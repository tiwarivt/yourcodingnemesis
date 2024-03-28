public class PrintLinearlyFromNTo1 {

    private static void printLinear(int n) {
        if (n != 0) {
            System.out.println(n);
            printLinear(n - 1);
        }
        return;
    }

    public static void main(String[] args) {
        int n = 10;
        printLinear(n);
    }
}