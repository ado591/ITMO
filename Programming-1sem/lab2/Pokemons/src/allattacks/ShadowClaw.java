package allattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {
    private final double critRate = 0.125;
    public ShadowClaw(double power, double accuracy) {
        super(Type.GHOST, power, accuracy);
    }
    @Override
    protected double calcCriticalHit(Pokemon attPokemon, Pokemon defPokemon) {
        if (critRate > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    protected String describe() {
        return "атакует с помощью " + this.getClass().getSimpleName();
    }
}
