package allattacks;
import ru.ifmo.se.pokemon.*;
public class SeedBomb extends PhysicalMove{
    public SeedBomb(double power, double accuracy) {
        super(Type.GRASS, power, accuracy);
    }
    @Override
    protected String describe() {
        return "атакует с помощью " + this.getClass().getSimpleName();
    }
}
