package basics.recursion.problems_two;


//parameterised way of recursion
public class SumOfFirstNNatNo {

    private static void sum(int n, int s) {
        if (n < 1) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n);
        return;
    }

    public static void main(String[] args) {
        int n = 10;
        sum(n, 0);
    }
}