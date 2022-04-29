import java.util.Scanner;

public class Exercicio_3_4 {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        do{

            if(!(age>=18)){
                System.out.println("you are too young.");
            }

            else if(age >= 18 && age <= 35){
                System.out.println("Young man.");
            }

            else if(age >= 36 && age <=60){
                System.out.println("You are middle age person.");
            }
            else {
                System.out.println("You are too old");
            }




        }while(age>300);

        scanner.close();

    }
}
