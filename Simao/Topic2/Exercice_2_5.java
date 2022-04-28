import java.util.Scanner;
public class Exercice_2_5 {

        public static void main (String[] args) {

            System.out.println("Enter a word or a number.");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.next();

            //charAt give a specific char in string 0 is the first position
            char wordEnd = word.charAt(0);
            System.out.println(wordEnd);

            switch(wordEnd){
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    System.out.println("Is numeric");
                    break;
                default:
                    System.out.println("Is not numeric");
                    break;

            }
        }

}


