import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Type a season of the year: ");
        String season = s.next();
        System.out.print("Type a whole number: ");
        int cups = s.nextInt();
        System.out.print("Type an adjective: ");
        String adjective = s.next();

        System.out.println("On a " + adjective + " " + season
                + " day, I drink a minimum of " + cups
                + " cups of coffee.");
    }
}