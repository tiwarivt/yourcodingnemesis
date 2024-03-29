package basics.recursion.problems_two;

public class SumOfFirstNNatNo {

    private static int sum(int s, int n) {
        if (n == 0) {
            return n;
        }
        s += sum(s, n - 1);
        return s;
    }

    public static void main(String[] args) {
        int n = 10;
        sum(0, n);
    }
}