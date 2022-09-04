// author @Candl3_

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
// task 1
//        System.out.println("Enter 10 numbers");
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("all prime numbers are:");
//        for (int i = 0; i < 10; i++) {
//            int count = 0;
//            for (int j = 1; j <= arr[i]; j++) {
//                if (arr[i] % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println("all perfect numbers are:");
//        for (int i = 0; i < 10; i++) {
//            int sum = 0;
//            for (int j = 1; j < arr[i]; j++) {
//                if (arr[i] % j == 0) {
//                    sum = sum + j;
//                }
//            }
//            if (sum == arr[i]) {
//                System.out.println(arr[i]);
//            }
//        }


// task 2
//        System.out.println("Enter 10 numbers");
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The difference between the largest and smallest number is:");
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println(max - min);#


// task 3
//        System.out.println("Enter 10 numbers");
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("All emirp numbers are:");
//        for (int i = 0; i < 10; i++) {
//            int count = 0;
//            for (int j = 1; j <= arr[i]; j++) {
//                if (arr[i] % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                int rev = 0;
//                int temp = arr[i];
//                while (temp > 0) {
//                    int rem = temp % 10;
//                    rev = rev * 10 + rem;
//                    temp = temp / 10;
//                }
//                int count1 = 0;
//                for (int j = 1; j <= rev; j++) {
//                    if (rev % j == 0) {
//                        count1++;
//                    }
//                }
//                if (count1 == 2) {
//                    System.out.println(arr[i]);
//                }
//            }
//        }


// task 4
//        System.out.println("Enter 10 numbers");
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The numbers are:");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println("The factorials of the numbers are:");
//        for (int i = 0; i < 10; i++) {
//            int fact = 1;
//            for (int j = 1; j <= arr[i]; j++) {
//                fact = fact * j;
//            }
//            System.out.println(fact);
//        }
//        System.out.println("The cubics of the numbers are:");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arr[i] * arr[i] * arr[i]);
//        }


// task 5
//        System.out.println("Enter 10 numbers");
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[2][5];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("The maximum number is:");
//        int max = arr[0][0];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println(max);
//        System.out.println("the location of the maximum number is:");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (arr[i][j] == max) {
//                    System.out.println("row " + (i+1) + " column " + (j+1));
//                }
//            }
//        }
//        System.out.println("The minimum number is:");
//        int min = arr[0][0];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (arr[i][j] < min) {
//                    min = arr[i][j];
//                }
//            }
//        }
//        System.out.println(min);
//        System.out.println("the location of the minimum number is:");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (arr[i][j] == min) {
//                    System.out.println("row " + (i+1) + " column " + (j+1));
//                }
//            }
//        }


// task 6
//
//        System.out.println("printing the multiplication table of 1 to 10");
//        int[][] arr = new int[10][10];
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                arr[i][j] = (i + 1) * (j + 1);
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


// task 7
//
//        System.out.println("enter the size of the 2d array");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//
//        System.out.println("checking if the array is symmetric or not");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        boolean flag = true;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] != arr[j][i]) {
//                    flag = false;
//                    break;
//                }
//            }
//        }
//        if (flag) {
//            System.out.println("the array is symmetric");
//        } else {
//            System.out.println("the array is not symmetric");
//        }
    }
}