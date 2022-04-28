package B2topic2;

import java.util.Scanner;

public class t2e2 {
    public static void main (String arg []){

        Double age;
        double price= 7;
        System.out.println("How old are you?");
        Scanner scanner= new Scanner(System.in);
        age= scanner.nextDouble();
        scanner.close();

        if(age>5){
            price=price*0.4;
        }
        if (age<60){
            price=price*0.45;
        }

        System.out.println("Your price is € " + price);
    }
}
