package allattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WingAttack extends PhysicalMove {
    public WingAttack(double power, double accuracy) {
        super(Type.FLYING, power, accuracy);
    }
    @Override
    protected String describe() {
        return "совершает " + this.getClass().getSimpleName();
    }
}
