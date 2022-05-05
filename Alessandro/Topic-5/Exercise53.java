import java.util.ArrayList;

public class Exercise53 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("Dog");
        x.add("Cat");
        x.add("Elephant");
        x.add("Racoon");
        x.add("No");
        System.out.println(x);

        x.add("Camel");
        System.out.println(x);

        x.remove(0);
        System.out.println(x);

        System.out.println("The size is " + x.size());

        System.out.println(x.get(2) + "\n");

        for(int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
        System.out.println();
        for(int i = 0; i < x.size(); i++) {
            if(x.get(i).contains("e")) {
                System.out.println(x.get(i));
            }
        }
    }
}
