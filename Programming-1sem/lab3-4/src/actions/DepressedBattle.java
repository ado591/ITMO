package actions;

import creatures.BugArmy;
import creatures.Shorty;
import customExceptions.DeadShortyException;

public class DepressedBattle extends Battle{
    private int turnAmount;

    public void setTurnAmount(int turns) {
        this.turnAmount = turns;
    }
    @Override
    public void startFight(Shorty shorty, BugArmy enemies) {
        final double scratchRate = 0.5;
        System.out.println(shorty);
        System.out.println("Коротышку атакует армия клопов числом " + enemies.getAmount());
        for (int i = 0; i < turnAmount; i++) {
            enemies.attack(shorty);
            try {
                isShortyAlive(shorty);
            }
            catch (DeadShortyException e) {
                shorty.setHp(400);
                break;
            }
        }
    }
}
