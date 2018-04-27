package furryjourney;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CatTest {

    static Cat cat = new Cat();

    @Test
    public void dogWalkShouldIncreaseCurrentHappinessByFivePerHour (){
        double currentHappiness = cat.getHappiness();
        cat.walk(1);
        assertEquals(currentHappiness + 5 * 1, cat.getHappiness());
    }
}
