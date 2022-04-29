package B2topic3;

//Exercise 3.4.  Create a program that read the age and print:
//
//-       If you are not older than 18, print “You are too young” (Use the symbol “!”)
//
//-       If your age is 18 or more and less or equals to 35, print “Young man”
//
//-       If you are more or equal to 36,  or your age is less or equals than 60, print “you are middle age person”
//
//-       For other situations print: “you are too old”


import java.util.Scanner;

public class t3e4 {
    public static void main(String[] args) {
        int age;

        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (!(age < 18)) {
            System.out.println("You are too young");
        }
        if (age >= 18 && age <= 35) {
            System.out.println("Young man");
        }
        if (age >= 36 && age <= 60) {
            System.out.println("you are middle age person");
        }
        if (age >= 61) {
            System.out.println("you are too old");
        }
    }
}
