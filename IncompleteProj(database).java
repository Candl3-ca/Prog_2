import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isRunning = true;

        ArrayList<Scientist> scientists = new ArrayList<Scientist>();
        ArrayList<Project> projects = new ArrayList<Project>();

        while (isRunning) {
            System.out.println("1- Add a Project 2- Add a Scientist 3- Show all 4- Exit. Enter your choice:  ");
            int choice = input.nextInt();
            Project project = null;
            switch (choice) {
                case 1:
                    project = new Project();
                    System.out.println("Enter the name of the project: ");
                    String name;
                    name = input.next();
                    if (name == null) {
                        System.out.println("Please enter a valid name");
                        name = input.next();
                    } else if (name == project.getP_name()) {
                        for (int i = 0; i < projects.size(); i++) {
                            if (projects.get(i).getName().equals(name)) {
                                System.out.println("This project already exists");
                                System.out.println("Enter the name of the project: ");
                                name = input.next();
                            }
                        }
                    }
                    System.out.println("Enter the project's number: ");
                    int number;
                    number = input.nextInt();
                    if (number < 0) {
                        System.out.println("Please enter a valid number");
                        number = input.nextInt();
                    } else if (number == project.getP_number()) {
                        for (int i = 0; i < projects.size(); i++) {
                            if (projects.get(i).getNumber() == number) {
                                System.out.println("This project already exists");
                                System.out.println("Enter the project's number: ");
                                number = input.nextInt();
                            }
                        }
                    }
                    Project p = new Project(name, number);
                    projects.add(p);
                    break;
                case 2:
                    Scientist scientist = new Scientist();
                    System.out.println("Enter the name of the scientist: ");
                    String name_Scientist = null;
                    name = input.next();
                    System.out.println("Enter the scientist's number: ");
                    int number_Scientist = 0;
                    number = input.nextInt();
                    boolean valid = false;
                    while (valid) {
                        if (number_Scientist < 0) {
                            System.out.println("Invalid number");
                            System.out.println("Enter the scientist's number: ");
                            number_Scientist = input.nextInt();
                        } else {
                            for (int i = 0; i < scientists.size(); i++) {
                                if (number_Scientist == scientists.get(i).getNumber()) {
                                    System.out.println("Invalid number");
                                    System.out.println("Enter the scientist's number: ");
                                    number_Scientist = input.nextInt();
                                } else {
                                    valid = true;
                                }
                            }

                            System.out.println("Enter the number of projects the scientist is working on: ");
                            int number_of_projects;
                            number_of_projects = input.nextInt();
                            int project_number = 0;
                            for (int i = 0; i < number_of_projects; i++) {
                                System.out.println("Enter the project number: ");
                                project_number = input.nextInt();
                                if (project_number < 0) {
                                    System.out.println("Invalid number");
                                    System.out.println("Enter the project number: ");
                                    project_number = input.nextInt();
                                } else if (project_number == project.getP_number()) {
                                    for (int j = 0; j < projects.size(); j++) {
                                        if (project_number == projects.get(j).getNumber()) {
                                            System.out.println("Invalid number");
                                            System.out.println("Enter the project number: ");
                                            project_number = input.nextInt();
                                        } else {
                                            valid = true;
                                        }
                                    }
                                }

                            }
                            Scientist s = new Scientist(name_Scientist, number_Scientist, project_number);
                            scientists.add(s);
                            break;
                        }
                    }
                            case 3:
                                System.out.println("Scientists: ");
                                for (int i = 0; i < scientists.size(); i++) {
                                    System.out.println(scientists.get(i).toString());
                                }
                                System.out.println("Projects: ");
                                for (int i = 0; i < projects.size(); i++) {
                                    System.out.println(projects.get(i).toString());
                                }
                                break;
                            case 4:
                                System.exit(0);
                                isRunning = false;
                                break;
                            default:
                                System.out.println("Invalid choice");
                                System.exit(0);
                                break;
                        }
                    }
            }

}


class Scientist {
    private String S_no;
    private String S_name;
    private Project P_no;
    private int number;

    public Scientist(String S_no, String S_name, int P_no) {
        this.S_no = S_no;
        this.S_name = S_name;
        this.P_no = new Project(P_no, number);
    }

    public Scientist(String name_scientist, int number_scientist, int project_number) {

    }

    public Scientist() {

    }

    public String getS_no() {
        return S_no;
    }

    public String getS_name() {
        return S_name;
    }

    public int getP_no() {
        return P_no.getP_no();
    }

    public void setS_no(String S_no) {
        this.S_no = S_no;
    }

    public void setS_name(String S_name) {
        this.S_name = S_name;
    }

    public void setP_no(int P_no) {
        this.P_no = new Project(P_no, number);
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "S_no='" + S_no + '\'' +
                ", S_name='" + S_name + '\'' +
                ", P_no='" + P_no + '\'' +
                '}';
    }

    public int getNumber() {
        return this.number;
    }
}

class Project {
    private int P_no;
    private String P_name;


    public Project(int P_no, int number) {
        this.P_no = P_no;
        this.P_name = P_name;
    }

    public Project() {

    }

    public Project(String name, int number) {
    }

    public int getP_no() {
        return P_no;
    }

    public String getP_name() {
        return P_name;
    }


    public void setP_no(int P_no) {
        this.P_no = P_no;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }


    @Override
    public String toString() {
        return "Project{" +
                "P_no='" + P_no + '\'' +
                ", P_name='" + P_name + '\'' +
                '}';
    }

    public Object getName() {
        return this.P_name;
    }

    public int getP_number() {
        return this.P_no;
    }

    public int getNumber() {
        return this.P_no;
    }
}
