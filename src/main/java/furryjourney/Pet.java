package furryjourney;
/**
 * Job: Understands important factors of pets' reaction
 */
public class Pet {
    protected double happiness;
    protected double satiety;
    protected double cleaniness;

    public Pet() {
        happiness = 0;
        satiety = 0;
        cleaniness = 0;
    }

    public double getHappiness() {
        return happiness;
    }

    public double getSatiety() {
        return satiety;
    }

    public double getCleaniness() {
        return cleaniness;
    }

    public void walk(double hour) {
        happiness += 10 * hour;
    }
}
