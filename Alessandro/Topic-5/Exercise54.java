public class Exercise54 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";

        System.out.println("Comparing " + a + " and " + b);
        if(a.equals(b)) {
            System.out.println("equals() worked!");
        }
        if(a.equalsIgnoreCase(b)) {
            System.out.println("equalsIgnoreCase() worked!");
        }
        if(a == b) {
            System.out.println("== worked!");
        }

        String string1 = "ELI";
        String string2 = new String("ELI");

        System.out.println("\nComparing " + string1 + " and " + string2);
        if(string1.equals(string2)) {
            System.out.println("equals() worked!");
        }
        if(string1.equalsIgnoreCase(string2)) {
            System.out.println("equalsIgnoreCase() worked!");
        }
        if(string1 == string2) {
            System.out.println("== worked!");
        }
    }
}
