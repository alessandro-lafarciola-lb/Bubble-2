public class Exercise61 {
    public static void main(String[] args) {
        Tester a = new Tester("Jokin", "Bold", true, 3);
        Tester b = new Tester();
        b.setName("Elia");
        b.setMindset("Explorer");
        b.setTesterByChance(false);
        b.setToenails(5);

        System.out.println("Tester A by chance? " + a.isTesterByChance());
        a.setTesterByChance(false);
        System.out.println("Tester A by chance? " + a.isTesterByChance());

        System.out.println("Tester B mindset = " + b.getMindset());
        a.setMindset("Friendly");
        System.out.println("Tester B mindset = " + b.getMindset());

        System.out.println("From Tester A, get toenails from Tester B = " + a.getToenailsFromObject(b));
    }
}
