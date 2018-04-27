package furryjourney;

/**
 * Job: Understands the capacity of pet sitter
 */
public class PetSitter {

    private double workingHour;
    private double MAX_WORKINGHOUR = 40.0;

    public PetSitter() {
        workingHour = 0;
    }

    public PetSitter(double MAX_WORKINGHOUR) {
        this.MAX_WORKINGHOUR = MAX_WORKINGHOUR;
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

    public boolean checkOvertime() {
        if (workingHour > MAX_WORKINGHOUR)
            return true;
        return false;
    }

    public void resetWorkingHour() {
        workingHour = 0;
    }
}
