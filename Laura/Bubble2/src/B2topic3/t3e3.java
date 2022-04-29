package B2topic3;

//Exercise 3.3. Create a program that read a type of animal.
// The program should print “this is not the correct animal” until the user write the correct one (“koala”).


import java.util.Scanner;

public class t3e3 {
    public static void main(String[] args) {
        String model= "Koala";

        System.out.println("Try to guess what my favourite animal is:");
        Scanner scanner= new Scanner(System.in);
        String animal= scanner.nextLine();

        while (!animal.equalsIgnoreCase(model)){
            System.out.println("No, no! Try again!");
            animal= scanner.nextLine();
        }
    scanner.close();
        System.out.println("Congratulations!");

    }
}
