package creatures;

import enums.Sex;

public class Animal extends Creature {
    public Animal(String species) {
        super(species);
    }
    public Animal(String species, String name, Sex sex) {
        super(species, name, 0, sex);
    }
    public Animal(String species, String name){
        super(species, name);
    }

    public void bite(Creature victim) {
        String message =  "Какое коварство! " + this.getName() + " кусает " + victim.getName();
        System.out.println(message);
    }
}
