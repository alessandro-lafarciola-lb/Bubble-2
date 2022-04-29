import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value = -1;
        int sum = 0;
        while(value != 0) {
            System.out.println("Type a value: ");
            value = s.nextInt();
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
