import java.lang.reflect.Array;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 10 values");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The values insterted are: " + Arrays.toString(arr));
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average /= arr.length;
        System.out.println("The average of the values is: " + average);

        System.out.println("all values greater than the average are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.println(arr[i]);
            }
        }
    }
}
