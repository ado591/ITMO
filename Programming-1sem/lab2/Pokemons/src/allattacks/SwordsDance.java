package allattacks;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon currentPokemon) {
        Effect swordsDanceEffect = new Effect()
                .chance(1)
                .stat(Stat.ATTACK, 2);
        currentPokemon.addEffect(swordsDanceEffect);
    }
    @Override
    protected String describe() {
        return "повысил атаку на 2 уровня с помощью " + this.getClass().getSimpleName();
    }
}

