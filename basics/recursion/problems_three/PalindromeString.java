package basics.recursion.problems_three;

public class PalindromeString {
    private static boolean flag = false;

    private static boolean pali(StringBuilder temp, String str, int len) {
        if (len >= 0) {
            temp.append(str.charAt(len));
        } else {
            return false;
        }
        if (str.equals(temp.toString())) {
            flag = true;
        } else {
            flag = false;
        }
        pali(temp, str, len - 1);
        return flag;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // String str = "palindrome";
        String str = "madam";
        int len = str.length() - 1;
        System.out.println(pali(sb, str, len));
    }
}