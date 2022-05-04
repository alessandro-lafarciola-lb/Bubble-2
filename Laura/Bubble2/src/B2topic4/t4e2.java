package B2topic4;

//Exercise 4.2.  Try to do the exercise of Java Course: chapter 5a but add another two methods. The first one should print the age of the person, and the second one if she is or not a zombie.

import javax.naming.Name;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Scanner;

public class t4e2 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("What's your name");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age= scanner.nextInt();

        System.out.println("Are you a zombie? Y/N");
        String zombie= scanner.next();
        scanner.close();

        System.out.println();


        showGreet(name);
        showAge(age);
        showZombie(zombie);


    }

    public static void showGreet(String name){
        System.out.println("Hello " + name + "!");
        System.out.println();
    }

    public static void showAge(int age){
        System.out.println("You are " + age + " years old.");
        System.out.println();
    }

    public static void showZombie(String zombie){

        if (zombie.equalsIgnoreCase("Y") ){
            System.out.println("Really? How did you become a zombie?");
        } if (zombie.equalsIgnoreCase("N") ){
            System.out.println("Oh great, I'm not a zombie either");
        }else{
            System.out.println("That's not a valid answer, so I guess I'll just have to keep my doubts to myself.");
        }


    }
}
