import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("menu. 1- create a folder, 2- create a file, 3- write to the file, 4- show full file, 5- delete file, 6- delete folder, 7- exit");
        int menu = sc.nextInt();
        String fileName;



        switch (menu){
            case 1:
                System.out.println("Enter the name of the folder");
                String folderName = sc.next();
                File folder = new File(folderName);
                folder.mkdir();
                break;
                case 2:
                    System.out.println("Enter the name of the file");
                    fileName = sc.next();
                    File file = new File(fileName);
                    file.createNewFile();
                    break;
            case 3:
                System.out.println("Enter the name of the file");
                fileName = sc.next();
                System.out.println("Enter the text to write to the file");
                String text = sc.nextLine();
                FileWriter writer = new FileWriter(fileName);
                writer.write(text);
                writer.close();
                break;
            case 4:
                System.out.println("Enter the name of the file to read");
                String fileName2 = sc.next();
                File file2 = new File(fileName2);
                Scanner sc2 = new Scanner(file2);
                while (sc2.hasNextLine()){
                    System.out.println(sc2.nextLine());
                }
                break;
            case 5:
                System.out.println("Enter the name of the file to delete");
                String fileName3 = sc.next();
                File file3 = new File(fileName3);
                file3.delete();
                break;
            case 6:
                System.out.println("Enter the name of the folder to delete");
                String folderName2 = sc.next();
                File folder2 = new File(folderName2);
                folder2.delete();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong number");
                System.out.println("Please re-enter the number");
                menu = sc.nextInt();
                break;
        }
    }

}
