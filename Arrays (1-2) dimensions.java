// author @Candl3_

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//         Write a program that asks for 10 numbers then searchs for a number in it.


//         System.out.println("Enter 10 numbers");
//         int[] list = new int[10];
        Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < 10; i++) {
//             list[i] = sc.nextInt();
//         }
//        System.out.println("Enter a number to search");
//        int num = sc.nextInt();
//        for(int i=0;i<10;i++) {
//            if (list[i] == num) {
//                System.out.println("Number found at " + i);
//            }
//        }





//         Switching values between even and off numbers


//         System.out.println("Switching locations of even and odd numbers");
//         for (int i = 0; i < 10; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(list[i] + " " + list[i + 1]);
//                 int temp = list[i];
//                 list[i] = list[i + 1];
//                 list[i + 1] = temp;
//             }
//         }






//         Counting the recurrences of a number in an array with a for loop


//         System.out.println("Searching every number and it's recurrence");
//            for (int i = 0; i < 10; i++) {
//                int count = 0;
//                for (int j = 0; j < 10; j++) {
//                    if (list[i] == list[j]) {
//                        count++;
//                    }
//                }
//                System.out.println("The number " + list[i] + " is found " + count + " times");
//            }


//         Taking 12 numbers and printing the in a 3 by 4 matrix as well as their sum


         System.out.println("Enter 12 numbers");
         int[] list2 = new int[12];
         int[][] matrix = new int[3][4];

            for (int i = 0; i < 12; i++) {
                list2[i] = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = list2[i * 4 + j];
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

         System.out.println("The sum of the 12 numbers is " + Arrays.stream(list2).sum());

        System.out.println("The sum of each row is ");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }
        System.out.println("The sum of each column is ");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += matrix[j][i];
            }
            System.out.println(sum);
        }


        System.out.println("Enter a number to search");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (list2[i] == num) {
                count++;
            }
        }

        System.out.println("The number " + num + " is found " + count + " times");

        System.out.println("Printing rows and columns where the number is found");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == num) {
                    System.out.println("The number " + num + " is found at row " + (i + 1) + " and column " + (j + 1) + ".");
                }
            }
        }


    }
}
