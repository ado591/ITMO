package allattacks;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip() {
        super(Type.NORMAL, 0, 100);
    }
    protected void applyOppEffects(Pokemon oppPokemon) {
        Effect tailWhipEffect = new Effect()
                .stat(Stat.DEFENSE, -1);
        oppPokemon.addEffect(tailWhipEffect);
    }
    @Override
    protected String describe() {
        return "понижает защиту противника с помощью " + this.getClass().getSimpleName();
    }
}
