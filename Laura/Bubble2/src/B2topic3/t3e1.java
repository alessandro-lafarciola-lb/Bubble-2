package B2topic3;

import java.util.Scanner;

//Exercise 3.1. Try to do the exercise of Java Course: Chapter 4a

public class t3e1 {
    public static void main(String[] args) {
        int pay= 15;
        double hours;
        double salary;


        System.out.println("How many hours have you worked this month?");
        Scanner scanner= new Scanner(System.in);
        hours= scanner.nextDouble();

        while(hours>40 || hours<1){
            System.out.println("The number of hours entered is not valid as it has to be between 1 and 40. Please try again.");
            hours= scanner.nextDouble();
        }
        scanner.close();
        salary=pay*hours;
        System.out.println("Your salary is €: " + salary);
    }
}
