//Exercise 5.2. Write a program that read a sentence(at least 4 words), split the string by spaces and store each piece of strings in an Array.
// Later print the third element, change the second element to 0, print all the elements and sort it.


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class t5e2 {

    public static void main(String[] args) {
        System.out.println("Write a sentence of at least 4 words:");
        Scanner scanner= new Scanner(System.in);
        String sentence= scanner. nextLine();
        scanner.close();

        String [] stringArray=sentence.split(" ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(stringArray));

        System.out.println(sentence);
        System.out.println(list);


    }
}
