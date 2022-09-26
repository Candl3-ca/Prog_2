

public class Main {

    public static void main(String[] args) {
        Human Dave = new Human("Dave", 2);
        Kangaroo num1 = new Kangaroo("Kang", 2);
        Horse num2 = new Horse("Horse", 0);
        Snake num3 = new Snake("Snakey", 0);

        System.out.println("--------------------------------------------");
        System.out.println(Dave);
        System.out.println("--------------------------------------------");
        System.out.println(num1);
        System.out.println("--------------------------------------------");
        System.out.println(num2);
        System.out.println("--------------------------------------------");
        System.out.println(num3);
    }
}

    class Animal{
        String name;
        String feet;

        public String feet(){
            return feet;
        }

        public Animal(String name) {
            this.name = name;
        }

    }

     class Human extends Animal{

        public Human(String name, int feet) {
            super(name);
            this.feet = String.valueOf(2); 
        }

         @Override
         public String toString() {
             return "Human{" +
                     "name='" + name + '\'' +
                      "feet='" + Human.this.feet +
                     '}';
         }
     }

     class Kangaroo extends Animal{

        public Kangaroo(String name, int feet){
            super(name);
            this.feet = String.valueOf(2);
        }

         @Override
         public String toString() {
             return "Kangaroo{" +
                     "name='" + name + '\'' +
                     ", feet=" + Kangaroo.this.feet +
                     '}';
         }
     }

     class Horse extends Animal{

        public Horse(String name, int feet) {
            super(name);
        }

        @Override
        public String feet() {
            return "The horse has 4 feets";
        }

         @Override
         public String toString() {
             return "Horse{" +
                     "name='" + name + '\'' +
                     "feet='" + feet() +
                     '}';
         }
     }

     class Snake extends Animal{

        public Snake(String name, int feet) {
            super(name);
        }

        @Override
        public String feet() {
            return "The Snake has no feet";
        }

         @Override
         public String toString() {
             return "Snake{" +
                     "name='" + name + '\'' +
                     "feet='" + feet() +
                     '}';
         }
     }

