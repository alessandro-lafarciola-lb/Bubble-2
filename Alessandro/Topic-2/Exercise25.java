import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type a character: ");
        char input = s.next().charAt(0);

        // Since the exercise asks that we print
        // using a 'switch' and not an 'if',
        // I had to do this thing first
        String number = "no";
        if(Character.isDigit(input))
            number = "yes";

        switch(number) {
            case "yes":
                System.out.println("The character is a number!");
                break;
            case "no":
                System.out.println("The character is NOT a number.");
                break;
        }
    }
}
