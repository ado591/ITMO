package allpokemons;
import allattacks.MegaDrain;
import allattacks.SwordsDance;
import ru.ifmo.se.pokemon.*;
public class Budew extends Pokemon{
    public Budew(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(40, 30, 35, 50, 70, 55);
        super.setMove(new SwordsDance());
        super.setMove(new MegaDrain(40, 100));
    }
}
