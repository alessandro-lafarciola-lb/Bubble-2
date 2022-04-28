public class Exercise14 {
    public static void main(String[] args) {
        int a, b, c
        a = 0
        // There's no ; after each statement

        System.out.println('ab');
        // If we want to print a text with more than one character,
        // then we need to use double quotation marks " "

        int d = 3.2;
        // The int type only works with whole numbers

        float e = 2.1;
        // To declare a float variable we need to put an 'f' after the value,
        // otherwise the code considers it a double type

        String f = a;
        // The 'a' in this case is considered a variable that wasn't declared,
        // if we want to have 'a' as text we need to put it between
        // quotation marks ' ' or " "

        int i = 10;
        float j;
        i = j;
        // Incompatible types, also 'j' wasn't initialized

        boolean g, h;
        g = false, h = true;
        // We can't chain separate statements using commas like this,
        // it only works when declaring variables

        String s = 'This is a string';
        // The text is not a String, but a char type because
        // it's using single quotation marks ' '
        // instead of double quotation marks " "
    }
}