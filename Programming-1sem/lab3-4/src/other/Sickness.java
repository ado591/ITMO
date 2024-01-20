package other;

import creatures.Person;

public class Sickness {
    private String name;
    public Sickness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static class Caught {
        private int intensity;

        public int getIntensity() {
            return intensity;
        }

        public void setIntensity(int intensity) {
            this.intensity = intensity;
        }
        public void startCaught(Person person) {
            System.out.println("кхе-кхе-кхе");
            System.out.println("А кто это тут кашляет? А, это " + person.getName());
        }
    }
}
