import java.util.Scanner;

public class Exercise44 {
    public static boolean isNumber(String our_pin) {
        boolean number = true;
        for(int i = 0; i < our_pin.length(); i++)
            if(!Character.isDigit(our_pin.charAt(i)))
                number = false;
        return number;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String our_pin;
        String pin = "1337";

        for(int i = 3; i > 0; i--) {
            System.out.print("Type a 4-digit pin: ");
            our_pin = s.next();
            while(!isNumber(our_pin) || our_pin.length() != 4) {
                System.out.print("Error. Type a 4-digit pin: ");
                our_pin = s.next();
            }

            if(our_pin.equals(pin)) {
                System.out.println("Access granted!");
                break;
            }
            else if(i == 1)
                System.out.println("Access denied. Your account was blocked.");
        }
    }
}
