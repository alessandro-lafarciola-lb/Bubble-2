package B2topic3;


//Exercise 3.6. System must request fill numbers until the user write the number zero. After that system will print the sum of all the numbers.

import java.util.Scanner;

public class t3e6 {

    public static void main(String[] args) {
        int x;
        int suma=0;

        System.out.println("Write down numbers and I will add them up. When you write 0 I will stop");
        Scanner scanner= new Scanner(System.in);
        x = scanner.nextInt();

        while(x!=0){
            System.out.println("Write a number");
           suma=suma+x;
            x = scanner.nextInt();
        }
        System.out.println("The sum is: " + suma);
    }
    }

