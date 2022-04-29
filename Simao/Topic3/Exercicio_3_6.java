import java.util.Scanner;

public class Exercicio_3_6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int value = -1;
       int sum = 0;
       while(value != 0){
           System.out.println("Type a number: ");
           value = scanner.nextInt();
           sum = sum +value;
       }
        System.out.println(sum);

    }
}
