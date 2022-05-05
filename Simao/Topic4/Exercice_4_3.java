import java.util.Scanner;

public class Exercice_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a value: ");
        int value = scanner.nextInt();

        for(int i = 0; i< value; i++){
            for(int j=0; j< value; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
