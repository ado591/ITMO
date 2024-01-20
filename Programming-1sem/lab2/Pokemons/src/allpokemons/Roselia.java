package allpokemons;
import allattacks.MegaDrain;
import allattacks.SeedBomb;
import allattacks.SwordsDance;

public class Roselia extends Budew{
    public Roselia(String name, int level) {
        super(name, level);
        super.setStats(50, 60, 45, 100, 80, 65);
        super.setMove(new SwordsDance());
        super.setMove(new MegaDrain(40, 100));
        super.setMove(new SeedBomb(80, 100));
    }
}
