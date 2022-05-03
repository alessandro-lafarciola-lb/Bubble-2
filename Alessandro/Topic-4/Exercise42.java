import java.util.Scanner;

public class Exercise42 {
    public static boolean isNumber(String text) {
        boolean number = true;
        if(text.length() == 0)
            number = false;
        for(int i = 0; i < text.length(); i++)
            if(!Character.isDigit(text.charAt(i)))
                number = false;
        return number;
    }
    public static void showUserName(String name) {
        System.out.println("Hello " + name + "!");
    }
    public static void showUserAge(int age) {
        System.out.println("You are " + age + " years old!");
    }
    public static void isUserZombie(String zombie) {
        if(zombie.equalsIgnoreCase("Y"))
            System.out.println("You are a zombie!!!");
        else
            System.out.println("You are not a zombie.");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = s.nextLine().trim().replaceAll(" +", " ");

        String text = "";
        while(!isNumber(text)) {
            System.out.print("Type your age: ");
            text = s.nextLine();
        }
        int age = Integer.parseInt(text);

        String zombie = "";
        while(!zombie.equalsIgnoreCase("Y")
                && !zombie.equalsIgnoreCase("N")) {
            System.out.println("Are you a zombie? (Y/N)");
            zombie = s.nextLine();
        }

        showUserName(name);
        showUserAge(age);
        isUserZombie(zombie);
    }
}
