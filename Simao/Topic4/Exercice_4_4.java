import java.util.Scanner;

public class Exercice_4_4 {

    public static boolean isNumber(String text) {
        boolean number = true;
        if(text.length() == 0)
            number = false;
        for(int i = 0; i < text.length(); i++)
            if(!Character.isDigit(text.charAt(i)))
                number = false;
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userPin;
        String pin = "1998";

       //3 tries to access
       for(int i = 3; i > 0; i--){
           System.out.println("Type a 4-digit pin: ");
           userPin = scanner.nextLine();
           while (!isNumber(userPin) || userPin.length() !=4){
               System.out.println("Error.type another 4-digit pin: ");
               userPin = scanner.next();
           }
           if(userPin.equals(pin)){
               System.out.println("Access granted!");
               break;
           }
           else if (i == 1)
               System.out.println("Access denied. Your account was blocked.");

           else
               System.out.println("Incorrect pin.");





       }




    }
}
