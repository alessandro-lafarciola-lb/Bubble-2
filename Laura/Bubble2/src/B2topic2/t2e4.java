package B2topic2;

import java.util.Scanner;

public class t2e4 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        System.out.println("Now I'm going to ask you to write down three diferent numbers.At the end I will tell you which one is the biggest");
        System.out.println("Write the first whole number");
        Scanner scanner= new Scanner(System.in);
        number1= scanner.nextInt();
        System.out.println("Write the second whole number");
        number2= scanner.nextInt();
        System.out.println("Write the third whole number");
        number3= scanner.nextInt();


        while (number1==number2 || number1==number3 ||number2==number3){
            System.out.println("There are two equals!!!! I asked for them to be different! Try again!");
            System.out.println("Write the first whole number");
            number1= scanner.nextInt();
            System.out.println("Write the second whole number");
            number2= scanner.nextInt();
            System.out.println("Write the third whole number");
            number3= scanner.nextInt();
        }

        if (number1>=number2 && number1>=number3 ){
                System.out.println("The first number is the biggest");
        }
        if(number2>=number3 && number2>= number1){
                System.out.println("The second number is the biggest");
        }
        if(number3>=number2 && number3>= number1){
                System.out.println("The third number is the biggest");

        }
        scanner.close();

    }
}

// A common error in this type of programs can be when nesting if-else, for that you have to try all the possible options.