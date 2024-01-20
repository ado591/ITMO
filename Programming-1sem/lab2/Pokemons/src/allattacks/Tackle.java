package allattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove{
        public Tackle(double power, double accuracy){
            super(Type.NORMAL,power,accuracy);
        }
        @Override
        protected String describe() {
            return "совершает " + this.getClass().getSimpleName();
        }
    }
