package B2topic4;

//Exercise 4.1. Try to do the exercise of Java Course: Chapter 4d,
// but instead of read the number of students and test, it should read the number of cars in a traffic jam, and thinking that each car has 2 people,
// fill the age of the people. Finally print the average of people.

import java.sql.SQLOutput;
import java.util.Scanner;

public class t4e1 {

    public static boolean isnumeric(String text){
        boolean number=true;

        if (text.length()==0){
            number= false;
        }
        for (int i=0; i<text.length(); i++){
            if (!Character.isDigit(text.charAt(i))){
                number =false;
            }
        }
        return number;
    }


    public static void main(String[] args) {
        double sum=0;
        double average;
        double sumAverage=0;
        double totalAverage=0;

        System.out.println("How many cars are in the traffic jam?");
        Scanner scanner= new Scanner(System.in);
        String text= scanner.nextLine();

        while (!isnumeric(text)){
            System.out.println("It`s not a number. Try again");
            text= scanner.nextLine();
        }

        int numberOfCars =Integer.parseInt(text);



            for(int i=0; i<numberOfCars; i++){
                for(int j=0; j<2; j++){
                    System.out.println("How old is the " + (j+1) + " person in the " + (i+1) + " car? ");
                    text= scanner.nextLine();

                    while (!isnumeric(text)){
                        System.out.println("It`s not a number. Try again");
                        text= scanner.nextLine();
                    }

                    int age= Integer.parseInt(text);

                    sum= sum+age;

                }

                average= sum/2;
                sum=0;
                sumAverage= sumAverage+ average;
                System.out.println("The average in the " + (i+1) + " car is: " + average + " years. ");
                System.out.println();



            }
        totalAverage= sumAverage/numberOfCars;
        System.out.println("The average of all cars is: " + totalAverage + " years");
        System.out.println();
        scanner.close();



    }
}
