package creatures;

import enums.Clothes;
import enums.Sex;
import other.Sickness;

import java.util.ArrayList;

public class Person extends Creature{
    private ArrayList<Clothes> clothes = new ArrayList<Clothes>();
    private ArrayList<Sickness> illnesses = new ArrayList<Sickness>();
    Person() {
        super("human", "Ivan", 0, Sex.MALE);
    }
    public Person(String name) {
        super("human", name, 0, Sex.MALE);
    }
    public Person(String name, int age) {
        super("human", name, age, Sex.MALE);
    }
    public Person(String name, int age, Sex sex) {
        super("human", name, age, sex);
    }

    public void wear(Clothes clothing) {
        clothes.add(clothing);
    }
    public ArrayList<Clothes> getClothing() {
        return this.clothes;
    }

    public void addSickness(Sickness sickness) {
        illnesses.add(sickness);
    }

}
