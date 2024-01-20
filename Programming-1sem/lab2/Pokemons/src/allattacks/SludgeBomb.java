package allattacks;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(double power, double accuracy) {
        super(Type.POISON, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect sludgeBombEffect =  new Effect().chance(0.3).condition(Status.POISON);
        oppPokemon.addEffect(sludgeBombEffect);
    }

    @Override
    protected String describe() {
        return "атакует при помощи " + this.getClass().getSimpleName();
    }
}
