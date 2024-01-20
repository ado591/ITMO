package allpokemons;

import allattacks.MegaDrain;
import allattacks.SeedBomb;
import allattacks.SludgeBomb;
import allattacks.SwordsDance;

public class Roserade extends Roselia{
   public Roserade(String name, int level) {
       super(name, level);
       super.setStats(60, 70, 65, 125, 105, 90);
       super.setMove(new SwordsDance());
       super.setMove(new MegaDrain(40, 100));
       super.setMove(new SeedBomb(80, 100));
       super.setMove(new SludgeBomb(90, 100));
   }
}
