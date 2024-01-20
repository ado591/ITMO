package allpokemons;

import allattacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Moltres extends Pokemon {
    public Moltres(String name, int level) {
        super(name, level);
        super.setStats(90, 100, 90, 125, 85, 90);
        super.setType(Type.FIRE, Type.FLYING);
        super.setMove(new Confide());
        super.setMove(new Rest());
        super.setMove(new AncientPower(60, 100));
        super.setMove(new WingAttack(60, 100));
    }
}
