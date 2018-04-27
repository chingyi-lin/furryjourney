package furryjourney;

/**
 * Understands cats' reaction towards different caring
 */

public class Cat extends Pet{

    @Override
    public void walk(double hour) {
        happiness += 5 * hour;
    }

    @Override
    public void takeShower() {
        super.takeShower();
        happiness -= 5;
    }

}
