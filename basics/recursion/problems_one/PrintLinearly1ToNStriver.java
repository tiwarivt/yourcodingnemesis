public class PrintLinearly1ToNStriver {

    private static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        print(1, n);
    }
}