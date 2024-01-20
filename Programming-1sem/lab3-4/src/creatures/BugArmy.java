package creatures;

import java.util.ArrayList;

public class BugArmy {
    private final int oneBugPower = 3;
    private int amount;
    private int power;
    private int alphaId;
    private int extraAlphaPower = 7;
    private ArrayList<Bug> bugs;
    private int countPower(int num) {
        int result = num * oneBugPower;
        if (alphaId < this.amount) {
            result += extraAlphaPower;
        }
        return result;
    }
    public BugArmy(int amount) {
        this.amount = amount;
        this.bugs = new ArrayList<Bug>();
        for (int i = 0; i < amount; i++) {
            this.bugs.add(new Bug());
            this.bugs.get(i).setRandomName();
        }
        this.alphaId = (int)(Math.random() * amount);
        this.power = countPower(amount);
    }
    public BugArmy(ArrayList<Bug> bugsArray) {
        this.amount = bugsArray.size();
        this.bugs = bugsArray;
        this.alphaId = (int)(Math.random() * bugsArray.size());
        this.power = countPower(bugsArray.size());
    }
    public void addBug(Bug newBug) {
        this.bugs.add(newBug);
        this.amount = this.bugs.size();
        this.power += oneBugPower;
    }
    public int getAmount() {
        return this.amount;
    }
    public int getPower() {
        return this.power;
    }
    public void deadArmy(int num) {
        bugs.removeIf(bug -> bugs.indexOf(bug) >= this.amount - num);
        this.amount = bugs.size();
        this.power = countPower(bugs.size());
    }
    public ArrayList<Bug> getList() {
        return this.bugs;
    }
    public int getAlphaId(BugArmy army) {
        return this.alphaId;
    }
    public void attack(Creature target) {
        int attackNumber = (int) (1 + Math.random() * this.amount);
        System.out.println("Армия клопов атакует числом " + attackNumber);
        for (int i = 0; i < attackNumber; i++) {
            int id = (int) (Math.random() * this.amount);
            this.bugs.get(id).bite(target);
            if (id == this.alphaId) {
                target.looseHp(10);
            }
            target.looseHp(3);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ArrayList<Bug> listAnotherArmy = ((BugArmy) obj).getList();
        if (this.amount != listAnotherArmy.size()) return false;
        for (int i = 0; i < this.amount; i++) {
            if (!listAnotherArmy.contains(this.bugs.get(i))) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int res = 0;
        for (int i = 0; i < amount; i++) {
            res += this.bugs.get(i).getName().hashCode();
        }
        return res;
    }
}
