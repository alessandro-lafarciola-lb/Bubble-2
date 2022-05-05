//Exercise 5.5. Write a program that initialize 5 strings in an ArrayList.
// From String class, use replace method to replace the "e" letter for "x" letter.
// Now include some spaces before each of the elements of the arrrayList with concat(),
// print it and use the method trim() to remove the spaces.


import java.util.ArrayList;

public class t5e5 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> colors2 = new ArrayList<String>();
        ArrayList<String> colors3 = new ArrayList<String>();
        ArrayList<String> colors4 = new ArrayList<String>();
        String space = " ";

        colors.add("green");
        colors.add("pink");
        colors.add("red");
        colors.add("yellow");
        colors.add("purple");


        System.out.println("My ArrayList is: " + colors);

        for (int i = 0; i < colors.size(); i++) {
            colors2.add(colors.get(i).replace("e", "x"));
        }
        System.out.println("And if i replace the \"e\" letter for \"x\" letter: " + colors2);


        for (int i = 0; i < colors.size(); i++) {
            colors3.add(space.concat(colors.get(i)));
        }
        System.out.println("My ArrayList with some spaces before each of the elements is: " + colors3);


        for (int i = 0; i < colors3.size(); i++) {
            colors4.add(colors3.get(i).trim());
            //System.out.println("My ArrayList with some spaces before each of the elements is: " + colors3.toString().trim());
        }
        System.out.println("My ArrayList with method trim() to remove the spaces is: " + colors4);

    }
}
