import java.util.ArrayList;
import java.util.Iterator;

public class Exercise53 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");
        list.add("Racoon");
        list.add("Hamster");
        System.out.println(list);

        list.add("Camel");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println("The size is " + list.size());

        System.out.println(list.get(2) + "\n");

        Iterator ite = list.iterator();

        while(ite.hasNext()) {
            System.out.println(ite.next());
        }
        System.out.println();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("e")) {
                System.out.println(list.get(i));
            }
        }
    }
}
