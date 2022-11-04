
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Scientist> s = new ArrayList<Scientist>();
        ArrayList<Project> p = new ArrayList<Project>();

        boolean isRunning = true;

        while(isRunning) {
            System.out.println("Menu :");
            System.out.println("1. Add a new Project. 2. Add a new Scientist. 3. Show full information. 4. Show information based on the scientist's name." +
                    " 5. Delete an existing project. 6. Delete an existing scientist. 7. Exit.");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Project name :");
                    String name = sc.next();
                    System.out.println("Enter the Project number :");
                    String number = sc.next();
                    boolean l = true;
                    while (l) {
                        if (p.size() == 0) {
                            l = false;
                        } else {
                            for (int i = 0; i < p.size(); i++) {
                                if (p.get(i).getNumber().equals(number)) {
                                    System.out.println("Project number already exists. Please enter a new number.");
                                    number = sc.next();
                                } else if (i == p.size() - 1) {
                                    l = false;
                                }
                            }
                        }
                    }
                    Project p1 = new Project(number, name);
                    p.add(p1);
                    break;
                case 2:
                    System.out.println("Enter the Scientist name :");
                    String name1 = sc.next();
                    System.out.println("Enter the Scientist number :");
                    String number1 = sc.next();
                    boolean f = true;
                    while (f) {
                        if (s.size() == 0) {
                            f = false;
                        } else {
                            for (int i = 0; i < s.size(); i++) {
                                if (s.get(i).getNumber().equals(number1)) {
                                    System.out.println("Scientist number already exists. Please enter a new number.");
                                    number1 = sc.next();
                                    break;
                                } else if (i == s.size() - 1) {
                                    f = false;
                                }
                            }
                        }
                    }
                    System.out.println("How many projects does the scientist work on?");
                    int num = sc.nextInt();
                    boolean g = true;
                    while (g) {
                        System.out.println("Enter the project number :");
                        String number2 = sc.next();
                        for (int i = 0; i < p.size(); i++) {
                            if (p.get(i).getNumber().equals(number2)) {
                                g = false;
                                break;
                            } else if (i == p.size() - 1) {
                                System.out.println("Project number does not exist. Please enter a new number.");
                            }
                        }
                    }
                    break;
                case 3:
                    if (p.size() == 0) {
                        System.out.println("There are no projects.");
                    } else {
                        for (int i = 0; i < p.size(); i++) {
                            System.out.println(p.get(i).toString());
                        }
                    }
                    if (s.size() == 0) {
                        System.out.println("There are no scientists.");
                    } else {
                        for (int i = 0; i < s.size(); i++) {
                            System.out.println(s.get(i).toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the Scientist name :");
                    String name2 = sc.next();
                    for (int i = 0; i < s.size(); i++) {
                        if (s.get(i).getName().equals(name2)) {
                            System.out.println(s.get(i).toString());
                        }
                    }
                    break;
                case 5:
//                    removing the project while also making sure theres no integrity constraint violation
                    System.out.println("Enter the project number :");
                    String projectNumber = sc.next();
                    for (int i = 0; i < p.size(); i++) {
                        for (int j = 0; j < s.size(); j++) {
                            if (p.get(i).getNumber().equals(projectNumber)) {
                                if (s.get(j).getProjectNumber().equals(projectNumber)) {
                                    System.out.println("Cannot delete project. There is a scientist working on this project.");
                                    break;
                                } else if (j == s.size() - 1) {
                                    p.remove(i);
                                    System.out.println("Project deleted.");
                                }
                            } else if (i == p.size() - 1) {
                                System.out.println("Project number does not exist.");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter the scientist number :");
                    String scientistNumber = sc.next();
                    for (Scientist scientist : s) {
                        if (scientist.getNumber().equals(scientistNumber)) {
                            s.remove(scientist);
                            break;
                        }
                    }
                    break;
                case 7:
                    isRunning = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
                    break;
            }
        }
    }
}

class Project{
    public String Pnumber_pk;
    public String Pname;

    public Project(String Pnumber_pk, String Pname){
        this.Pnumber_pk = Pnumber_pk;
        this.Pname = Pname;
    }

    public Project(){
    }


    public String getNumber() {
        return Pnumber_pk;
    }

    public String getName() {
        return Pname;
    }
}

class Scientist{
    public String Snumber_pk;
    public String Sname;
    public Project Pnumber_fk;

    public Scientist(String Snumber_pk, String Sname, Project Pnumber_fk){
        this.Snumber_pk = Snumber_pk;
        this.Sname = Sname;
        this.Pnumber_fk = Pnumber_fk;
    }

    public Scientist(){
    }

    public Scientist(String Snumber_pk, String Sname, String Pnumber_fk) {
    }

    public String getName() {
        return Sname;
    }

    public String getProjectNumber() {
        return Pnumber_fk.getNumber();
    }

    public String getNumber() {
        return Snumber_pk;
    }

    public Project getProject() {
        return Pnumber_fk;
    }
    
}
