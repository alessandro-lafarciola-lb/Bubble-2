import java.util.Scanner;

public class Exercicio_3_3 {
    public static void main(String[] args) {
        String animal = "koala";
        System.out.println("Insert a type of animal.");
        Scanner scanner = new Scanner(System.in);
        String randomAnimal = scanner.next();
        while(!animal.equalsIgnoreCase(randomAnimal)){
            System.out.println("This is not the correct animal.");
            //create a sentinel to control de loop
            randomAnimal = scanner.next();
        }
        scanner.close();
        System.out.println("You guess the right animal!");
    }
}

