package B2topic1;

import java.util.Scanner;

public class t2e1 {
    public static void main(String arg[]) {
        System.out.println("Write a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Write a whole number");
        int number = scanner.nextInt();


        System.out.println("Write an adjective");
        String adjective = scanner.next();


        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");
        scanner.close();
    }
}
