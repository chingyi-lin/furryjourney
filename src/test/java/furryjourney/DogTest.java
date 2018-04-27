package furryjourney;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DogTest {

    @Test
    public void newDogShouldHaveZeroHappiness (){
        assertEquals(0 , new Dog().getHappiness());
    }
}
