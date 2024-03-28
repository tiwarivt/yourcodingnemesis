/**
 * PrintName5Times
 */

// using static
public class PrintName5Times {

static int i = 5;
private static void printName5Times() {
if (i != 0) {
System.out.println("VT");
i--;
printName5Times();
}
return;
}

public static void main(String[] args) {
printName5Times();
}
}

// without using static
/*
public class PrintName5Times {

    private static void printName5Times(int i) {
        if (i != 0) {
            System.out.println("VT");
            printName5Times(i - 1);
            i--;
        }
        return;
    }

    public static void main(String[] args) {
        printName5Times(5);
    }
}
*/