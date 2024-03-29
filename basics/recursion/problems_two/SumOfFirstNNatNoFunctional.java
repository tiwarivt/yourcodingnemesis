package basics.recursion.problems_two;
//functional recursion
public class SumOfFirstNNatNoFunctional {
    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n -1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}