import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = s.next();
        System.out.print("Type your age: ");
        int age = s.nextInt();
        System.out.println("Are you a zombie! (Y/N)");
        String zombie = s.next();

        showUserName(name);
        showUserAge(age);
        isUserZombie(zombie);
    }

    public static void showUserName(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void showUserAge(int age) {
        System.out.println("You are " + age + " years old!");
    }

    public static void isUserZombie(String zombie) {
        if(zombie.equals("Y"))
            System.out.println("You are a zombie!!!");
        else
            System.out.println("You are not a zombie.");
    }
}
