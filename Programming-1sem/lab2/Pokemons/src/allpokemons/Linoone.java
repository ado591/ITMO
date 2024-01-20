package allpokemons;

import allattacks.*;
import ru.ifmo.se.pokemon.*;

public class Linoone extends Zigzagoon {
    public Linoone(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(78, 70, 61, 50, 61, 100);
        super.setMove(new Rest());
        super.setMove(new TailWhip());
        super.setMove(new ShadowClaw(70, 100));
        super.setMove(new Tackle(40, 100));
    }
}
