package basics.recursion.problems_three;

public class PalindromeString {

    static boolean pali(StringBuilder temp, String str) {
        int len = str.length() - 2;
        if(len > 0){
            temp.append(temp.charAt(len));
            len--;
        }
        if(str.equals(temp.toString())){
            return true;
        }
        return pali(temp, str);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "palindrome";
        // String str = "madam";
        System.out.println(pali(sb, str));
    }
}