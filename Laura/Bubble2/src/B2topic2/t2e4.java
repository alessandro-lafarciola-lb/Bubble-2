package B2topic2;

import java.util.Scanner;

public class t2e4 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        System.out.println("Now I'm going to ask you to write down three numbers");
        System.out.println("Write the first whole number");
        Scanner scanner= new Scanner(System.in);
        number1= scanner.nextInt();
        System.out.println("Write the second whole number");
        number2= scanner.nextInt();
        System.out.println("Write the third whole number");
        number3= scanner.nextInt();
        scanner.close();

        if (number1>number2){
            if(number1>number3) {
                System.out.println("The first number is the biggest");
            }
            }else{
            if(number2>number3){
                System.out.println("The second number is the biggest");
            }else{
                System.out.println("The third number is the biggest");
            }
        }


    }
}

// A common error in this type of programs can be when nesting if-else, for that you have to try all the possible options.