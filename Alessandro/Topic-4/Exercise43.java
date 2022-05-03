import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type a value: ");
        int value = s.nextInt();

        for(int i = 0; i < value; i++) {
            for(int j = 0; j < value; j++)
                System.out.print("*");

            System.out.print(" ");
        }
    }
}
