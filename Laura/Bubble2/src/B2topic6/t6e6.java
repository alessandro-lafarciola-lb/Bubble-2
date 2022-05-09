package B2topic6;
//Exercise 6.1.
//
//1.     Create a new class Tester.
//
//2.     Create a no-argument constructor, and a constructor that initialize all the attributes of the class.
//
//3.     The new class should have the following attributes: Name, mindset , isTesterByChance?, long toenails.
//
//4.     Create the getter and setters for each attribute.
//
//5.     From the main class create two objects with different attributes and perform the following actions:
//
//a.    Change the attribute isTeserByChance of Tester 1 and print it
//
//b.    Change the attribute mindset of Tester2 and print it
//
//6.     From the class Tester, create a method that has a parameter: the object tester and returns the long toenails.  Figure out how to calculate it . Then call the method from the main class and print it.
//
//a.    Note: you can call to a class methods from two different ways:
//
//           i.     Instance a new class: New Tester().calculateLongToenail()
//
//           ii.     Using the object: Tester1.calculateLongToenail()
//
//Try both options.
//
//Now make up a new method and call it from the main class
public class t6e6 {

    public static void main(String[] args) {


    tester a= new tester("Laura", "open", true, 5);
    tester b= new tester();
    b.setName("Juan");
    b.setMindset("close");
    b.setTesterByChance(false);
    b.settoenails(2);

    // a.    Change the attribute isTeserByChance of Tester 1 and print it
    System.out.println("Tester 1" + a.getTesterByChance());
    a.setTesterByChance(false);
    System.out.println("Tester 1" + a.getTesterByChance());

 // b.    Change the attribute mindset of Tester2 and print it
    System.out.println("Tester 2" + b.getMindset());
    b.setMindset("funny");
    System.out.println("Tester 2" + b.getMindset());

 //6.     From the class Tester, create a method that has a parameter: the object tester and returns the long toenails.
 // Figure out how to calculate it . Then call the method from the main class and print it
        System.out.println(a.calculateToenails(a));
        System.out.println(new tester().calculateToenails(a));





    //Now make up a new method and call it from the main class
        System.out.println(a.toString());
        System.out.println(b.toString());
    }

}
