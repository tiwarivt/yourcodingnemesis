public class PrintLinearlyFrom1ToN {
    private static int i = 0;
    private static void printLinear(int n) {
        if (i < n) {
            i++;
            System.out.println(i);
            printLinear(n);
        }
        return;
    }

    public static void main(String[] args) {
        int n = 10;
        printLinear(n);
    }
}