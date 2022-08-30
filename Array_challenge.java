// author @Candl3_

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int count = 1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=count;
                count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=count;
                count++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=count;
                count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=count;
                count++;
            }
            left++;
        }

        System.out.println("The matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}