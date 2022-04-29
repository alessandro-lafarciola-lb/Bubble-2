import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type an animal: ");
        String text = s.next();

        while(!text.equalsIgnoreCase("koala")) {
            System.out.println("this is not the correct animal");
            System.out.print("Type an animal: ");
            text = s.next();
        }

        System.out.println("you guessed the animal!");
    }
}
