package creatures;
import actions.Actions;
import enums.Sex;
import places.Place;
import places.RoomItem;


public abstract class Creature implements Actions {
    private final String species;
    private String name;
    private int age;
    private Sex sex;
    private int hp;
    Creature() {
        this.species = "unknown";
        this.name = "unnamed";
        this.age = 0;
        this.sex = Sex.OTHER;
        this.hp = 1000;
    }
    Creature(String species, String name, int age, Sex sex) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hp = 1000;
    }
    public Creature(String species, String name) {
        this.species = species;
        this.name = name;
        this.age = 0;
        this.sex = Sex.OTHER;
        this.hp = 1000;
    }
    public Creature(String species) {
        this.species = species;
        this.name = "unnamed";
        this.age = 0;
        this.sex = Sex.OTHER;
        this.hp = 1000;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp() {
        return this.hp;
    }
    protected void looseHp(int hp) {
        this.hp -= hp;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    @Override
    public void run(RoomItem item) {
        System.out.println(this.name + " бежит к " + item.getName());
    }

    @Override
    public void eat(String food) {
        System.out.println(this.name + " ест " + food);
    }

    @Override
    public void jump(Place start, Place finish) {
        System.out.println(this.name + " прыгает с " + start.getName() + " к " + finish.getName());
    }

    @Override
    public void sit(RoomItem place) {
        System.out.println(this.name + " сидит на " + place.getName());
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " спит");
    }

    @Override
    public void wakeUp() {
        System.out.println(this.name + " проснулся!");
    }

}
