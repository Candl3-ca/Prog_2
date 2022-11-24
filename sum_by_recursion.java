import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The sum of the digits is: " + add(number));
    }
    private static int add(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number + add(number - 1);
        }
    }
}
