package furryjourney;

/**
 * Job: Understands the capacity of pet sitter
 */
public class PetSitter {

    private double workingHour;
    private final double MAX_WORKINGHOUR = 40.0;

    public PetSitter() {
        workingHour = 0;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void walkPet(Pet pet, double hour) {
        pet.walk(hour);
        workingHour += hour;
    }

    public void washPet(Pet pet) {
        pet.takeShower();
        if (pet instanceof Cat)
            workingHour += 1.5;
        else
            workingHour += 1;
    }
}
