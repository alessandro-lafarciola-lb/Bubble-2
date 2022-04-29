import java.util.Scanner;

public class Exercicio_3_1 {
    public static void main(String[]args){
        int moneyPerHour = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work in a week?");
        Scanner scanner = new Scanner(System.in);
        double hours = scanner.nextDouble();

        while(maxHours < hours || hours < 1){
            System.out.println("Error.Your hours must be between 1 and 40,try again.");
            //sentinel - control the loop
            hours = scanner.nextDouble();
        }
        scanner.close();

        double payment = moneyPerHour * hours;
        System.out.println("you get $" + payment);


    }
}
