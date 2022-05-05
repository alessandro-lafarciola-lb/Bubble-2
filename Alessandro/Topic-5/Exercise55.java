import java.util.ArrayList;

public class Exercise55 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("Spider");
        x.add("Racoon");
        x.add("Hamster");
        x.add("Dog");
        x.add("Goose");
        System.out.println(x);

        String text = "";
        for(int i = 0; i < x.size(); i++) {
            x.set(i, x.get(i).replaceAll("e", "x"));
            x.set(i, " " + x.get(i));
            text = text + x.get(i);
        }

        System.out.println(text.trim());
    }
}
