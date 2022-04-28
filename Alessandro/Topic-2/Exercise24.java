import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type a number: ");
        double a = s.nextDouble();
        System.out.print("Type a number: ");
        double b = s.nextDouble();
        System.out.print("Type a number: ");
        double c = s.nextDouble();

        System.out.print("The biggest value is ");
        if (a >= b && a >= c)
            System.out.println(a);
        else if (b >= a && b >= c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
