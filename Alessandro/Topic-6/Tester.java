public class Tester {
    private String Name;
    private String mindset;
    private boolean isTesterByChance;
    private long toenails;

    public Tester(String Name, String mindset, boolean isTesterByChance, long toenails) {
        this.Name = Name;
        this.mindset = mindset;
        this.isTesterByChance = isTesterByChance;
        this.toenails = toenails;
    }

    public Tester() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMindset() {
        return mindset;
    }

    public void setMindset(String mindset) {
        this.mindset = mindset;
    }

    public boolean isTesterByChance() {
        return isTesterByChance;
    }

    public void setTesterByChance(boolean testerByChance) {
        isTesterByChance = testerByChance;
    }

    public long getToenails() {
        return toenails;
    }

    public void setToenails(long toenails) {
        this.toenails = toenails;
    }

    public long getToenailsFromObject(Tester object) {
        return object.toenails;
    }
}
