package allattacks;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain(double power, double accuracy) {
        super(Type.GRASS, power, accuracy);
    }
    @Override
    protected void applySelfEffects(Pokemon currentPokemon) {
        currentPokemon.setMod(Stat.HP, -((int)currentPokemon.getStat(Stat.ATTACK) / 2));
    }
    protected String describe() {
        return "использует способность " + this.getClass().getSimpleName() + " и восстанавливает HP";
    }
}
