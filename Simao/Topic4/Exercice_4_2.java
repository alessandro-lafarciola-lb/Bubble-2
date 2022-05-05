import java.util.Scanner;

public class Exercice_4_2 {

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("You are a zombie?" + "\n" + "Enter yes or no: " + "\n");
        String zombie = scanner.next();
        greetUser(name);
        agePerson(age);
        zombie_user(zombie);
    }
    public static void greetUser(String name) {
        System.out.println("Hi there, " + name + "!");
    }

    ////method age of the person
    public static void agePerson(int age) {
        System.out.println("Your age is " + age + ".");
    }

    ////method if is zombie or not
    public static void zombie_user(String zombie) {
        String yes = "true";
        boolean yes1 = Boolean.parseBoolean(yes);
        if(zombie.equalsIgnoreCase("yes")) {
            System.out.println("You are a " +yes1+ " zombie.");
        }
        else{
            System.out.println("You are a "+!yes1+" zombie.");
        }





    }
}







