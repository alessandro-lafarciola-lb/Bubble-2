class Exercise23 {
    public static void main(String[] args) {
        String text_a = "Hello";
        String text_b = "hello";

        if(text_a.equals(text_b))
            System.out.println("1 - Both texts are equal!");
        if(text_a.equalsIgnoreCase(text_b))
            System.out.println("2 - Both texts are equal!");
        if(text_a == text_b)
            System.out.println("3 - Both texts are equal!");
    }
}
