//    author @Candl3_

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Task 1
//        System.out.println("Enter a character : ");
//        System.out.println("Checking for uppercase/lowercase character...");
//        char val = sc.next().charAt(0);
//        System.out.println("Character: "+val);
//        if (Character.isUpperCase(val)) {
//            System.out.println("Character is in Uppercase!");
//        }else {
//            System.out.println("Character is in Lowercase!");
//        }

//        Task 2
//        System.out.println("Hello student, please input your height in cm : ");
//        int height = sc.nextInt();
//        if (height  >= 170 || height <= 190) {
//            System.out.println("Please enter your weight in kg : ");
//            int weight = sc.nextInt();
//                if (weight > 80) {
//                      System.out.println("You are eligible to join the soccer team!");
//                }else {
//                      System.out.println("You don't meet the requirements to join the soccer team!");
//                }
//            } else if (height > 190) {
//            System.out.println("enter your weight in kg : ");
//            int weight = sc.nextInt();
//                if (weight >= 80 || weight <= 95) {
//                     System.out.println("You are eligible to join the basketball team!");
//                 } else {
//                     System.out.println("You don't meet the requirements to join the basketball team!");
//                 }
//        } else {
//            System.out.println("You are too short to join any team!");
//        }


//        Task 3
//        System.out.println("Enter a number : ");
//        int num = sc.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("Number is even!");
//        }else {
//            System.out.println("Number is odd!");
//        }
//        if (num % 7 == 0) {
//            System.out.println("Number is also divisible by 7!");
//        }else {
//            System.out.println("Number is also not divisible by 7!");
//        }


//        Task 4
//        System.out.println("enter a lowercase or an uppercase character : ");
//        char val = sc.next().charAt(0);
//        if (Character.isUpperCase(val)) {
//            System.out.println("Character is in Uppercase!");
//            System.out.println("Now printing the lowercase version of the character : ");
//            System.out.println(Character.toLowerCase(val));
//        }else {
//            System.out.println("Character is in Lowercase!");
//            System.out.println("Now printing the uppercase version of the character : ");
//            System.out.println(Character.toUpperCase(val));
//        }


//        Task 5
//        System.out.println("Enter a number of days : ");
//        int days = sc.nextInt();
//        int years = days / 365;
//        int months = (days % 365) / 30;
//        System.out.println("Number of years: "+years);
//        System.out.println("Number of months: "+months);
//        System.out.println("Number of days: "+days);

////       Sorry got a bit bored with this one
////
////        System.out.println("Number of hours: "+days*24);
////        System.out.println("Number of minutes: "+days*24*60);
////        System.out.println("Number of seconds: "+days*24*60*60);
////        System.out.println("Number of milliseconds: "+days*24*60*60*1000);
////        System.out.println("Number of microseconds: "+days*24*60*60*1000*1000);
////        System.out.println("Number of nanoseconds: "+days*24*60*60*1000*1000*1000);
////        System.out.println("Number of picoseconds: "+days*24*60*60*1000*1000*1000*1000);
////        System.out.println("Number of femtoseconds: "+days*24*60*60*1000*1000*1000*1000*1000);
////        System.out.println("Number of attoseconds: "+days*24*60*60*1000*1000*1000*1000*1000*1000);
////        System.out.println("Number of zeptoseconds: "+days*24*60*60*1000*1000*1000*1000*1000*1000*1000);
////        System.out.println("Number of yoctoseconds: "+days*24*60*60*1000*1000*1000*1000*1000*1000*1000*1000);
////        System.out.println("Number of deciseconds: "+days*24*60*60*1000*1000*1000*1000*1000*1000*1000*1000*10);
////        System.out.println("Number of centiseconds: "+days*24*60*60*1000*1000*1000*1000*1000*1000*1000*1000*10*10);
////        System.out.println("Number of milliseconds: "+days*24*60*60*1000*1000*1000*1000*1000*1000*1000*1000*10*10*10);


//        Task 6
//        System.out.println("Enter a number : ");
//        int num = sc.nextInt();
//        System.out.println("Switching the number to binary : ");
//        System.out.println(Integer.toBinaryString(num));
//        System.out.println("Switching the number to octal : ");
//        System.out.println(Integer.toOctalString(num));
//        System.out.println("Switching the number to hexadecimal : ");
//        System.out.println(Integer.toHexString(num));

//        Task 7
//        double N;
//        int i;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        N = scanner.nextFloat();
//        System.out.println("Armstrong Number between 0 to " + (int) N);
//
//        for (i = 0; i < N; i++) {
//            if (calc(i)) {
//                System.out.println(i + " ");
//            }
//        }
//    }
//
//    public static boolean calc(int num) {
//        int sum = 0, dig, temp;
//        temp = num;
//        int length = String.valueOf(num).length();
//
//                On each run, the last digit of num is stored in the temp.
//                Then, remainder is powered by x (number of digits) using Math.pow() and is added to the sum.
//                Then, the last digit is removed from originalNumber after division by 10.
//
//        while (temp != 0) {
//            dig = temp % 10;
//            sum += Math.pow(dig, length);
//            temp = temp / 10;
//        }
//
//        if (sum == num) {
//            return true;
//        } else {
//            return false;
//        }
    }
}