package furryjourney;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CatTest {

    static Cat cat = new Cat();
    static double MAX_FACTOR = 100.0;

    @Test
    public void catWalkShouldIncreaseCurrentHappinessByFivePerHour (){
        double currentHappiness = cat.getHappiness();
        cat.walk(1);
        assertEquals(currentHappiness + 5 * 1, cat.getHappiness());
    }

    @Test
    public void catTakeShowerShouldReachMaxCleaniness (){
        cat.takeShower();
        assertEquals(MAX_FACTOR, cat.getCleaniness());
    }

    @Test
    public void catTakeShowerShouldDecreaseCurrentHappinessByFive (){
        double currentHappiness = cat.getHappiness();
        cat.takeShower();
        assertEquals(currentHappiness - 5, cat.getHappiness());
    }
}
