import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type your age: ");
        int age = s.nextInt();

        double price = 7;
        if(age < 5)
            price = price * 0.4; // 60% Discount
        if(age > 55)
            price = price * 0.45; // 55% Discount

        System.out.println("The price is €" + price);
    }
}
