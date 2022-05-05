//Exercise 5.3. Write a program that initialize 5 strings in an ArrayList. Add another element,
// remove the first, print the size of the arraylist, print the element in the index 3,
// and use Iterator class to print all the elements of the arraylist. Finally, check all the elements of the arraylist and find the elements that contains the letter “e”.

import java.util.ArrayList;
import java.util.Iterator;

public class t5t3 {
    public static void main(String[] args) {
        ArrayList<String> x= new ArrayList<>();
        x.add("aa");
        x.add("bb");
        x.add("cc");
        x.add("de");
        x.add("ee");

        System.out.println("My arrayList is: " + x);

        x.add("ff");
        System.out.println("I have added another element: " + x);

        x.remove(0);
        System.out.println("I have removed another element: " + x);

        System.out.println("The size of my arrayList is: " + x.size());

        System.out.println("The third element of my arrayList is: " + x.get(2));

        System.out.println("List with iterator method: ");

        Iterator<String> it = x.iterator();
            while(it.hasNext()) {
                System.out.print(it.next() + " ");
            }

        System.out.println("The elements whit -e- are: ");
        int sum =0;
        for(int i=0; i<x.size(); i++){


         if(x.get(i).contains("e")){
             sum=sum+1;
             System.out.println(x.get(i));;
         };


        }
        System.out.println("There are " + sum + " elements with the letter -e-");


    }
}
