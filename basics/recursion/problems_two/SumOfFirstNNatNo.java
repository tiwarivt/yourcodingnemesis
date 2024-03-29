package basics.recursion.problems_two;

public class SumOfFirstNNatNo {
    static int s = 1;

    private static int sum(int n) {
        if (n == 1) {
            return s;
        }
        s = sum(n) + sum(n - 1);
        return s;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}