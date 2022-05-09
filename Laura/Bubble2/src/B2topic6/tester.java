package B2topic6;

public class tester {
    String name;
    String mindset;
    Boolean isTesterByChance;
    int toenails;

    public tester(String name, String mindset, Boolean isTesterByChance, int toenails) {
        this.name = name;
        this.mindset = mindset;
        this.isTesterByChance = isTesterByChance;
        this.toenails= toenails;
    }

    public tester() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMindset() {
        return mindset;
    }

    public void setMindset(String mindset) {
        this.mindset = mindset;
    }

    public Boolean getTesterByChance() {
        return isTesterByChance;
    }

    public void setTesterByChance(Boolean testerByChance) {
        isTesterByChance = testerByChance;
    }

    public int gettoenails() {
        return toenails;
    }

    public void settoenails(int toenails) {
        this.toenails = toenails;
    }

    //6.     From the class Tester, create a method that has a parameter: the object tester and returns the long toenails.
    // Figure out how to calculate it . Then call the method from the main class and print it.

    public int calculateToenails (tester object){
        return object.gettoenails();
    }
    //Now make up a new method and call it from the main class

    @Override
    public String toString() {
        return "tester{" +
                "name='" + name + '\'' +
                ", mindset='" + mindset + '\'' +
                ", isTesterByChance=" + isTesterByChance +
                ", toenails=" + toenails +
                '}';
    }
}
