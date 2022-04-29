import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = "";
        while(!text.equalsIgnoreCase("koala")) {
            System.out.println("Type an animal: ");
            text = s.next();

            if(!text.equalsIgnoreCase("koala"))
                System.out.println("this is not the correct animal");
        }
        System.out.println("you guessed the animal!");
    }
}
