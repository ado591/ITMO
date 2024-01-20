package allpokemons;

import ru.ifmo.se.pokemon.*;
import allattacks.*;
public class Zigzagoon extends Pokemon{
    public Zigzagoon(String name, int level) {
        super(name, level);
        super.setStats(38, 30, 41, 30, 41, 60);
        super.setType(Type.NORMAL);
        super.setMove(new Rest());
        super.setMove(new TailWhip());
        super.setMove(new Tackle(40, 100));

    }
}
