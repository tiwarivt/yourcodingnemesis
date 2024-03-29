package basics.recursion.problems_three;

public class PaliTwoPointer {
    private static boolean pali(int left, int right, String str) {
        if (left >= right ) {
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return pali(left + 1, right - 1, str);
    }

    public static void main(String[] args) {
        String str = "madam";
        // String str = "palindrome";
        System.out.println(pali(0, str.length() - 1, str));
    }
}