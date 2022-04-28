package JavaTopic_1;

import java.util.Scanner;

public class Exercice_1_2 {

    public static void main(String[]args){
        //int--Know what year did you born

        System.out.println("How many years do you have?");
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();

        System.out.println("What year are you?");
        int actualYear = scanner.nextInt();

        int year_born = actualYear - years;
        System.out.println("You born in "+ year_born +".");

        //double-- How much did you receive for extra hours in 30 days( Note : per hour you receive 1.5)
        Double Per_hour = 1.5;
        System.out.println("How many extra hours did you work in the last 30 days?");
        double extraHours = scanner.nextDouble();
        double hoursPayed = extraHours * 1.5;

        System.out.println("You will receive for this 30 days €" + hoursPayed + ".");


        //boolean- Compare ages
        System.out.println("Enter one age.");
        int firstAge = scanner.nextInt();

        System.out.println("Enter another age.");
        int secondAge = scanner.nextInt();
        boolean compare =(firstAge == secondAge);
        System.out.println(compare);


        //String
        System.out.println("Pick an adjective to complete de next Sentence");
        String adjective = scanner.next();
        System.out.println("Java is "+ adjective);
    }
}
