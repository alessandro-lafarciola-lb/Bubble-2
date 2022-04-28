import java.util.Scanner;

public class Exercice_1_1 {

    public static void main(String[] args){

        //Get the Season of the year
        System.out.println("Insert any Season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Get the number
        System.out.println("Insert any number.");
        int number = scanner.nextInt();

        //Get an adjective
        System.out.println("Insert any adjective.");
        String adjective = scanner.next();
        scanner.close();

        //Insert the information in the sentence
        System.out.println("On a " + adjective + " " + season
                + " day, I drink a minimum of " + number + " cups of coffee.");

    }

}
