/**
 * PrintLinearlyNto1Backtracking
 */

// backtracking: print line is after the recursion call
public class PrintLinearly1toNBacktracking {
    private static void printNTo1Backtrack(int i, int n) {
        if (i < 1) {
            return;
        }
        printNTo1Backtrack(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 10;
        printNTo1Backtrack(n, n);
    }
}