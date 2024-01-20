package creatures;

import enums.Colors;
import enums.Sex;

public class Rat extends Animal{
    private Colors color;
    private int weight;
    public Rat() {
        super("rat", "unknown", Sex.MALE);
        this.weight = 1;
        this.color =  Colors.GREY;
    }
    public Rat(String name, Sex sex, int weight, Colors color) {
        super("rat", name, sex);
        this.weight = weight;
        this.color = color;
    }
    public void smell(Creature target) {
       System.out.println(this.getName() + " обнюхивает " + target.getName() +
                ". Хорошо, что экран не передает запахи.");
    }
    public String toString(){
        return "Крыска с цветом шерстки " + this.color;
    }


    public class Eye{
        private String color;
        public Eye() {
            this.color = "grey";
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }

    public void lookAt(Creature creature, Eye eye) {
        System.out.println(this.getName() + " смотрит на " + creature.getName() + " " + eye.getColor() + " глазками");
    }

    public class Nose{
        private String size;
        public Nose() {
            this.size = "маленький и круглый";
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }
    }

}
