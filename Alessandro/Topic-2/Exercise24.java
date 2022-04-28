import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type a value: ");
        double a = s.nextDouble();
        System.out.println("Type a value: ");
        double b = s.nextDouble();
        System.out.println("Type a value: ");
        double c = s.nextDouble();

        if(a >= b && a >= c)
            System.out.println(a);
        if(b >= a && b >= c)
            System.out.println(b);
        if(c >= a && c >= b)
            System.out.println(c);
    }
}
