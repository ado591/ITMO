import allpokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Budew p1 = new Budew("Чарли", 1);
        Linoone p2 = new Linoone("Пикси", 1);
        Moltres p3 = new Moltres("Бобик", 1);
        Roselia p4 = new Roselia("Эдди", 1);
        Roserade p5 = new Roserade("Витязь", 1);
        Zigzagoon p6 = new Zigzagoon("Пупырка", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();
    }
}