package allattacks;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    final double DEFAULT_CHANCE = 0.1;
    public AncientPower(double power, double accuracy) {
        super(Type.ROCK, power, accuracy);
    }
    @Override
    protected void applySelfEffects(Pokemon currentPokemon) {
        Effect ancientPowerEffect = new Effect()
                .chance(DEFAULT_CHANCE)
                .stat(Stat.ATTACK, 1)
                .stat(Stat.DEFENSE, 1)
                .stat(Stat.SPECIAL_ATTACK, 1)
                .stat(Stat.SPECIAL_DEFENSE, 1)
                .stat(Stat.SPEED, 1);
        currentPokemon.addEffect(ancientPowerEffect);
    }
    @Override
    protected String describe() {
        return "совершает " + this.getClass().getSimpleName();
    }
}
