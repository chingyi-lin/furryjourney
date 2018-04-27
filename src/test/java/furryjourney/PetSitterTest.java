package furryjourney;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PetSitterTest {

    static PetSitter sitter = new PetSitter();

    @Test
    public void walkADogOneHourShouldLogAnWorkingHour() {
        double currWorkingHour = sitter.getWorkingHour();
        sitter.walkPet(new Dog(), 1);

        assertEquals(currWorkingHour + 1, sitter.getWorkingHour());
    }

    @Test
    public void washADogOneHourShouldLogOneWorkingHour() {
        double currWorkingHour = sitter.getWorkingHour();
        sitter.washPet(new Dog());

        assertEquals(currWorkingHour + 1, sitter.getWorkingHour());
    }

    @Test
    public void washACatOneHourShouldLogOneAndHalfWorkingHour() {
        double currWorkingHour = sitter.getWorkingHour();
        sitter.washPet(new Cat());

        assertEquals(currWorkingHour + 1.5, sitter.getWorkingHour());
    }

    @Test
    public void checkOvertimeShouldReturnTrueForSitterWhoExceedsItsWorkLimit() {
        PetSitter sitter = new PetSitter(0.0001);
        sitter.washPet(new Cat());

        assertTrue(sitter.checkOvertime());
    }

    @Test
    public void resetWorkingHourShouldSetWorkingHourToZero() {
        sitter.resetWorkingHour();

        assertEquals(0.0, sitter.getWorkingHour());
    }
}
