package B2topic4;

//Exercise 4.4. You have to design the code of the access of an account. The user can try the access 3 times, if the pin is not correct 3 times, the account will be blocked.
//The pin must be a number of 4 digits.
//The actions of the system should be:
//-       Verify if it’s only a numbers (no letters)
//-       Verify if its only 4 digits (not 3 or 1, it must be 4)
//-       If the pin code doesn’t fit, user must fill again and again (infinite times) until the pin code accomplish the rules.
//-       If the pin code is correct, system allows access to the account.
//-       If the pin code is incorrect, user has other 2 tries. If after the 3 attempts user don’t fill the correct pin code, the account will be blocked.


//    public static boolean isNumber(String text) {
//        boolean number = true;
//        if(text.length() == 0)
//            number = false;
//        for(int i = 0; i < text.length(); i++)
//            if(!Character.isDigit(text.charAt(i)))
//                number = false;
//        return number;
//    }

import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;

//Pendiente añadir librería number utils


public class t4e4 {

    public static void main(String[] args) {

        String realpin= "1111";

        Scanner scanner= new Scanner (System.in);


        for (int i=0; i<3 ; i++){
            System.out.println("Enter yor pin code");
            String pin= scanner.nextLine ();
            while ((pin.length() != 4) || NumberUtils.isCreatable(pin)) {
                System.out.println("The code is not correct. Remember it must be a 4 digit number.");
                pin = scanner.nextLine();
            }
            if (pin.equals(realpin)){
                System.out.println("Correct");
                break;
            }
            else if (i==2){
                System.out.println("Blocked");
            }else{
                System.out.println("It's not correct");
            }


        }


        scanner.close();



    }




}
