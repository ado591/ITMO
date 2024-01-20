package actions;

import creatures.BugArmy;
import creatures.Shorty;

public class Battle implements KillBugs{
    @Override
    public void shakeOff(BugArmy enemies) {
        int killedAmount = (int) (Math.random() * enemies.getAmount()) + 1;
        System.out.println("Легким движением руки были скинуты " + killedAmount + " клопов.");
        enemies.deadArmy(killedAmount);
    }

    @Override
    public boolean isArmyAlive(BugArmy enemies) {
        return enemies.getAmount() > 0;
    }

    @Override
    public boolean isAlphaAlive(BugArmy enemies) {
        return enemies.getAlphaId(enemies) < enemies.getAmount();
    }

    @Override
    public boolean isShortyAlive(Shorty shorty) {
        return shorty.getHp() > 0;
    }

    private void shortyTurn(Shorty shorty, BugArmy enemies) {
        System.out.println("Незнайка начинает стряхивать клопов");
        shakeOff(enemies);
    }

    public void startFight(Shorty shorty, BugArmy enemies) {
        final double scratchRate = 0.5;
        System.out.println("Бой начался! На одной стороне ринга: ");
        System.out.println(shorty);
        System.out.println("На другой стороне ринга армия клопов числом " + enemies.getAmount());
        while(true) {
            shortyTurn(shorty, enemies);
            if (Math.random() > scratchRate) {
                shorty.scratch();
                if (!isShortyAlive(shorty)) {
                    System.out.println("Коротышка слишком много чесался и потерял сознание");
                    break;
                }
            }
            if (!isArmyAlive(enemies)) {
                System.out.println("Коротышка стряхнул всех клопов");
                break;
            }
            enemies.attack(shorty);
            if (!isShortyAlive(shorty)) {
                System.out.println("Коротышку загрызли клопы");
                break;
            }

        }
    }
}
