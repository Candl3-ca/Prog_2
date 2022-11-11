import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean t = true;

        ArrayList<CompanyA> companyA = new ArrayList<CompanyA>();
        ArrayList<CompanyB> companyB = new ArrayList<CompanyB>();

        System.out.println("Inputting info for Company A");
        while (t) {
            System.out.println("Enter the employee's name: ");
            String name;
            name = sc.next();
            System.out.println("Enter the employee's age: ");
            int age;
            age = sc.nextInt();
            System.out.println("Enter the employee's salary: ");
            int salary;
            salary = sc.nextInt();
            CompanyA a = new CompanyA(name, age, salary);
            companyA.add(a);
            System.out.println("Do you want to add another employee? (y/n)");
            char c = sc.next().charAt(0);
            if (c == 'n') {
                t = false;
            }
        }

        System.out.println("Inputting info for Company B");
        t = true;
        while (t){
            System.out.println("Enter the employee's name: ");
            String name;
            name = sc.next();
            System.out.println("Enter the employee's age: ");
            int age;
            age = sc.nextInt();
            System.out.println("Enter the employee's salary: ");
            int salary;
            salary = sc.nextInt();
            CompanyB b = new CompanyB(name, age, salary);
            companyB.add(b);
            System.out.println("Do you want to add another employee? (y/n)");
            char c = sc.next().charAt(0);
            if (c == 'n') {
                t = false;
            }
        }

        System.out.println("Info for Company A");
        System.out.println("---------------------------");
        System.out.println("Highest paid employee: " + companyA.get(0).sort(companyA)[0]);
        System.out.println("sorted list in ascending order based on names: ");
        for (int i = 0; i < companyA.size(); i++) {
            System.out.println(companyA.get(i).getName() + " is " + companyA.get(i).getAge() + " years old.");
        }


        System.out.println("Info for Company B");
        System.out.println("---------------------------");
        System.out.println("Youngest employee: " + companyB.get(0).sort(companyB)[0]);
        System.out.println("sorted list in descending order based on salary: ");
        for (int i = 0; i < companyB.size(); i++) {
            System.out.println(companyB.get(i).getName() + " is " + companyB.get(i).getAge() + " years old.");
        }



    }
}

class CompanyA implements Calculate, Organize {

    String name;
    int age;
    int salary;


    public CompanyA(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public int getAge() {
        return age;
    }

    @Override
    public int calculate(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public String[] sort(ArrayList array) {
        String[] names = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            names[i] = ((CompanyA) array.get(i)).getName();
        }
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.size(); i++){
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }
}

class CompanyB implements Calculate, Organize {

    String name;
    int age;
    int salary;

    public CompanyB(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int calculate(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public String[] sort(ArrayList array) {
        String salary[] = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            salary[i] = ((CompanyB) array.get(i)).getName();
        }
        for (int i = 0; i < salary.length; i++) {
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i].compareTo(salary[j]) < 0) {
                    String temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }
            }
        }
        for (int i = 0; i < salary.length; i++) {
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i].compareTo(salary[j]) < 0) {
                    String temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }
            }
        }
        return salary;
    }
        
}

interface Organize {
    String[] sort(ArrayList array);
}

interface Calculate {
    int calculate(int[] array);
}
