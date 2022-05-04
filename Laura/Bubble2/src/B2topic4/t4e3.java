package B2topic4;

//Exercise 4.3. Write a program to read an integer value on the keyboard and print an asterisk square of this size. For instance, if the number is 4, the program must print: **** **** **** ****

//    public static boolean isNumber(String text) {
//        boolean number = true;
//        if(text.length() == 0)
//            number = false;
//        for(int i = 0; i < text.length(); i++)
//            if(!Character.isDigit(text.charAt(i)))
//                number = false;
//        return number;
//    }
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String text = ".";
//        while(!isNumber(text)) {
//            System.out.print("Type a value: ");
//            text = s.nextLine();
//        }
//        int value = Integer.parseInt(text);
import java.util.Scanner;

public class t4e3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Print a whole number");
        int value= scanner.nextInt ();
        scanner.close();

        for(int i =0; i <value; i++){
            for(int j =0; j <value; j++){
                System.out.print("*");


            }
            System.out.println();
        }




    }
}
