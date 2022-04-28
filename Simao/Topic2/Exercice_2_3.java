public class Exercice_2_3 {
    public static void main(String[] args){
        String x = "Hello";
        String y = "hello";
     // equals()-compare the strings, needs to be completely equal

        if(x.equals(y)){
                System.out.println("they are equal.");
            }
        else{
            System.out.println("They are different.");
        }
        //equalsIgnoreCasa() ignoring the lower or upper case , just see the length and the characters

        if (x.equalsIgnoreCase(y)) {
            System.out.println("They are equal.");
        }
        else{
            System.out.println("They are different.");
        }

        //== when variables are connected to the same object
        if (x==y) {
            System.out.println("They are equal.");
        }
        else{
            System.out.println("They are different.");
        }


    }
}
