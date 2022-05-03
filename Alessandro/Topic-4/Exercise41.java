import java.util.Scanner;

public class Exercise41 {
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
        String text = "";
        while(!isNumber(text)) {
            System.out.print("Type the number of cars: ");
            text = s.nextLine();
        }
        int cars = Integer.parseInt(text);
        int people = 2;
        double sum = 0;

        for(int i = 0; i < cars; i++) {
            System.out.println("Car " + (i + 1));
            for(int j = 0; j < people; j++) {
                text = "";
                while(!isNumber(text)) {
                    System.out.print("Type the age of person " + (j + 1) + " : ");
                    text = s.nextLine();
                }
                sum += Integer.parseInt(text);
            }
        }

        double average = sum / (cars * people);
        System.out.println("The averAGE age is " + average);
    }
}
