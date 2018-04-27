package furryjourney;
/**
 * Job: Understands important factors of pets' reaction
 */
public class Pet {
    protected int happiness;
    protected int satiety;
    protected int cleaniness;

    public Pet() {
        happiness = 0;
        satiety = 0;
        cleaniness = 0;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getCleaniness() {
        return cleaniness;
    }

    public void walk() {
        happiness += 10;
    }
}
