//Exercise 5.4. Declare two equals strings, one in uppercase and another one in lower case. Try to use equalsIgnoreCase()  and equals() to know if both strings are the same or not.

//Now declare the following variables:

//String string1= “ELI”;

//String string2= new String(“ELI”);

//Can you try to compare with "=="?. It works in the same way that equals()? Why? Bring your answers to the daily :)


public class t5e4 {
    public static void main(String[] args) {


    String a= "Hello";
    String b= "hello";

        System.out.println("We are comparing " + a + " to " + b);
    if (a.equals(b)){
        System.out.println(" equals method works");
    }

    if (a.equalsIgnoreCase(b)){
            System.out.println(" equalsIgnoreCase method works");
    }

    if (a==b){
            System.out.println(" == method works");
    }

        String string1= "ELI";
        String string2= new String("ELI");

        System.out.println("We are comparing " + string1 + " to " + string2);
        if (string1.equals(string2)){
            System.out.println(" equals method works");
        }

        if (string1.equalsIgnoreCase(string2)){
            System.out.println(" equalsIgnoreCase method works");
        }

        if (string1==string2){
            System.out.println(" == method works");
        }


    }
}
