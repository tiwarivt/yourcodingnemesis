package basics.recursion.problems_three;

public class PaliOnePointerStriver {
    private static boolean pali(int i, String str) {
        if (i >= str.length() - 1 / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }
        return pali(i + 1, str);
    }

    public static void main(String[] args) {
        // String str = "madam";
        String str = "palindrome";
        System.out.println(pali(0, str));
    }
}