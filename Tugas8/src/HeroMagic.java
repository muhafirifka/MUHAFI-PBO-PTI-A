public class HeroMagic extends Hero {
    private String power;

    public HeroMagic(String name, double health) {
        super(name, health);
        this.power = "Magic";
    }

    public String getPower() {
        return this.power;
    }

    // Override method display
    @Override
    public void display() {
        System.out.println(getName() + " is a " + power + " Hero.");
    }
}
