import java.util.Scanner;

public class Exercise43 {
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
        Scanner s = new Scanner(System.in);
        String text = ".";
        while(!isNumber(text)) {
            System.out.print("Type a value: ");
            text = s.nextLine();
        }
        int value = Integer.parseInt(text);

        for(int i = 0; i < value; i++) {
            for(int j = 0; j < value; j++)
                System.out.print("*");
            System.out.print(" ");
        }
    }
}
