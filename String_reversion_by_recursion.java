import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Reversed string is: " + reverseString(str));
    }

    private static String reverseString(String str) {
        if(str.length() == 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
