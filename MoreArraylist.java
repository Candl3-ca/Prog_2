import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean t = true;
        ArrayList<String> arr = new ArrayList<String>();

        while (t) {
            System.out.println("Enter a string: ");
            arr.add(sc.nextLine());
            System.out.println("Do you want to continue? (y/n)");
            String s = sc.nextLine();
            if (s.equals("n")) {
                t = false;
            }
        }
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1; j < arr.size(); j++) {
//                if (arr.get(i).compareTo(arr.get(j)) > 0) {
//                    String temp = arr.get(i);
//                    arr.set(i, arr.get(j));
//                    arr.set(j, temp);
//                }
//            }
//        }
//        System.out.println("Sorted strings are: ");
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }

        boolean flag = true;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(arr.size() - i - 1))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The arraylist is palindrome");
        } else {
            System.out.println("The arraylist is not palindrome");
        }
    }
}
