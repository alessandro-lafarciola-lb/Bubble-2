package B2topic2;

import java.util.Scanner;

public class t2e3 {

    public static void main(String[] args) {
        String word1;
        String word2;

        System.out.println("Write the first word");
        Scanner scanner= new Scanner(System.in);
        word1= scanner.nextLine();
        System.out.println("Write the second word");
        word2= scanner.nextLine();
        scanner.close();

        if (word1==word2){
            System.out.println("Write the first word");
        }
    }

    }
}
