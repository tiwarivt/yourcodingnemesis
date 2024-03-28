public class PrintNameNStriver {

    private static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("VT");
        print(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 3;
        print(1, n);
    }
}