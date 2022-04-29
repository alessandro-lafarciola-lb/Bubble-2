import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = 0;

        while(1 > 0) {
            System.out.println("Type your age: ");
            age = s.nextInt();
            if (!(age >= 18))
                System.out.println("You are too young");
            else if (age >= 18 && age <= 35)
                System.out.println("Young man");
            else if (age >= 36 && age <= 60)
                System.out.println("you are a middle aged person");
            else
                System.out.println("you are too old");
        }
    }
}
