import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Candl3\\Desktop\\test.txt");
        Scanner sc = new Scanner(System.in);
        file.createNewFile();

        System.out.println("Enter text to write to file: ");
        FileWriter writer = new FileWriter(file);
        writer.write(sc.nextLine());
        writer.close();
        System.out.println("File written to successfully");


        Scanner fileScanner = new Scanner(file);
        int count = 0;
        while (fileScanner.hasNext()) {
            fileScanner.next();
            count++;
        }
        System.out.println("Number of words: " + count);
    }

}
