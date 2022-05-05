import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        String text = s.nextLine();
        ArrayList<String> x = new ArrayList<>();

        for(int i = 0; i < text.split(" ").length; i++) {
            x.add(text.split(" ")[i]);
        }

        System.out.println(x);
        System.out.println(x.get(2));
        x.set(1, "0");
        System.out.println(x);
        Collections.sort(x);
        System.out.println(x);
    }
}
