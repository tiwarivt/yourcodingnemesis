package basics.recursion.problems_two;
//functional recursion
public class SumOfFirstNNatNoFunctional {
    private static int sum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return sum(n-1) + sum(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}