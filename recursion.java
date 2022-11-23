import java.util.*;
import java.io.*;



public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the base number: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter the power number: ");
        int power = sc.nextInt();
        System.out.println("The result is: " + power(base, power));

    }

    private static String power(int base, int power) {
        if (power == 0) {
            return "1";
        } else {
            return base + " * " + power(base, power - 1);
        }
    }
}
