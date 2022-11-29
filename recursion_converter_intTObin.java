import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Eneter a positive integer to convert to binary");
        int input = sc.nextInt();
        System.out.println("The binary of " + input + " is " + toBinary(input));
    }



    private static String toBinary(int input) {
        try{
            String result = "";
        if (input == 0){
            return "0";
        } else if (input == 1){
            return "1";
        } else{
            while (input > 0){
                result = input % 2 + result;
                input = input / 2;
            }
        }
    } catch (Exception e){
            System.out.println(e);
        }
        return "0";
    }
}
