import java.util.*;

public class Main {

    public static void main(String[] args) {
//
//        int n;
//        int prime_number;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        n = input.nextInt();
//        if (n == 1) {
//            System.out.println("1 is not a prime number");
//        }
//        else {
//            for (int i = 2; i <= n; i++) {
//                prime_number = 0;
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        prime_number = 1;
//                    }
//                }
//                if (prime_number == 0) {
//                    System.out.println(i + " is a prime number");
//                }
//            }
//        }
//
//    }

        for( int i = 3; i <= 100; i++) {
            int prime = 0;
            for( int j = 2; j < i; j++) {
                if( i % j == 0) {
                    prime = 1;
                }
            }
            if( prime == 0) {
                System.out.println(i + " is a prime number");
            }
        }
    }
}