package actions;

import creatures.BugArmy;
import creatures.Shorty;

public interface KillBugs {
    void shakeOff(BugArmy enemies);
    boolean isArmyAlive(BugArmy enemies);
    boolean isAlphaAlive(BugArmy enemies);
    boolean isShortyAlive(Shorty shorty);
}
