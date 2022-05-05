import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = "";
        String old_list[] = {};

        while(old_list.length < 4) {
            System.out.print("Type a sentence with at least 4 words: ");
            text = s.nextLine();
            old_list = text.split(" ");
        }

        ArrayList<String> new_list = new ArrayList<>();
        for(int i = 0; i < old_list.length; i++) {
            new_list.add(old_list[i]);
        }

        System.out.println(new_list);

        System.out.println(new_list.get(2));

        new_list.set(1, "0");

        System.out.println(new_list);

        Collections.sort(new_list);
        System.out.println(new_list);
    }
}
