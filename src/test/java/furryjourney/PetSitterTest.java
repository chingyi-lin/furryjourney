package furryjourney;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PetSitterTest {

    static PetSitter sitter = new PetSitter();

    @Test
    public void walkADogOneHourShouldLogAnWorkingHour() {
        double currWorkingHour = sitter.getWorkingHour();
        sitter.walkPet(new Dog(), 1);

        assertEquals(currWorkingHour + 1, sitter.getWorkingHour());
    }

    @Test
    public void washADogOneHourShouldLogAnWorkingHour() {
        double currWorkingHour = sitter.getWorkingHour();
        sitter.washPet(new Dog());

        assertEquals(currWorkingHour + 1, sitter.getWorkingHour());
    }
}
