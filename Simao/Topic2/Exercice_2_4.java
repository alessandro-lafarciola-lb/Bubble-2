import java.util.Scanner;

public class Exercice_2_4 {
    public static void main(String[] args){
        //value 1
        System.out.println("Enter the first number.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //value 2
        System.out.println("Enter the second number.");
        int y = scanner.nextInt();

        //value 3
        System.out.println("Enter the third number.");
        int z = scanner.nextInt();
        scanner.close();

        if(x < y && z < y){ //or is ||
            System.out.println("Second number is the biggest ");
        }
        if(y < x && z < x){
            System.out.println("First number is the biggest");
        }
        else{
            System.out.println("Third is the biggest number");
        }
    }
}
