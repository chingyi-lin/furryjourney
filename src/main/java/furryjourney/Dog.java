package furryjourney;

/**
 * Understands dogs' reaction towards different caring
 */

public class Dog extends Pet {



    @Override
    public void walk(double hour) {
        happiness += 15 * hour;
    }


}
