package B2topic2;

import java.util.Scanner;

public class t2e5 {
    public static void main(String[] args) {

        String a;
        int valor=0;

        System.out.println("Write a word, if you lie to me I will know it");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        scanner.close();
        char x= a.charAt(0);
        boolean resultado=Character.isDigit(x);

        if (resultado==true){
            valor=1;
        }
        if(resultado==false){
            valor=2;
        }

        switch(valor){
            case 1:
                System.out.println("The first character is not a letter. Are you kidding me?");
                break;
            case 2:
                System.out.println("The first character is a letter");
                break;
            default:
                System.out.println("What are you doing?");
                break;
        }

    }
}