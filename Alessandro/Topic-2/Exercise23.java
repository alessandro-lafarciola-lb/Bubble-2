public class Exercise23 {
    public static void main(String[] args) {
        String text_a = "Hello!";
        String text_b = "Hello!";

        if(text_a.equals(text_b)) // Preferred way of checking if two texts are the same
            System.out.println("1 if - Both texts are equal!");
        if(text_a.equalsIgnoreCase(text_b)) // Alternative that's not case-sensitive
            System.out.println("2 if - Both texts are equal!");
        if(text_a == text_b) // Normally it works, but using equals() is more accurate
            System.out.println("3 if - Both texts are equal!");
    }
}
