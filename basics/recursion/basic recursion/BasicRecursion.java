package basics.recursion;

public class BasicRecursion {

    private static void rec() {
        System.out.println("Can't stop, won't stop!");
        rec();
    }

    public static void main(String[] args) {
        rec();
    }
}