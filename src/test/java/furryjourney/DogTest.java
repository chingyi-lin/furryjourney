package furryjourney;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DogTest {

    static Dog dog = new Dog();

    @Test
    public void newDogShouldHaveZeroHappiness (){
        assertEquals(0 , new Dog().getHappiness());
    }

    @Test
    public void newDogShouldHaveZeroSatiety (){
        assertEquals(0 , new Dog().getSatiety());
    }

    @Test
    public void newDogShouldHaveZeroCleaniness (){
        assertEquals(0 , new Dog().getCleaniness());
    }

    @Test
    public void dogWalkShouldIncreaseCurrentHappinessByFifteen (){
        int currentHappiness = dog.getHappiness();
        dog.walk();
        assertEquals(currentHappiness + 15, dog.getHappiness());
    }
}
