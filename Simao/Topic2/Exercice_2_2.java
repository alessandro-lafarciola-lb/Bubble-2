import java.util.Scanner;

public class Exercice_2_2 {
    public static void main(String[] args){
        //Get costumer age
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        //ticket option
       if(age < 5){
            System.out.println("You will have a 60% discount, You only pay 2.8 euros.");
       }
       else if(60 < age){
           System.out.println("You will have a 55% discount, You only pay 3,15 euros.");
       }
        else{
           System.out.println(" You will pay a normal ticket that is 7 euros.");
       }

        }
    }


