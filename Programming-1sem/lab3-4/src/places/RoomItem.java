package places;

import creatures.Creature;

public class RoomItem {
    private String name;
    private String material = "no info";

    private Creature takenBy = null;

    private final double bugsRate = 0.5;
    public RoomItem(String name) {
        this.name = name;
    }
    public void fromMaterial(String material) {
        this.material = material;
    }
   public boolean checkBugs(RoomItem item) {
        return Math.random() > bugsRate;
   }

    public String getName() {
        return this.name;
    }

    public boolean isFree() {
        if (this.takenBy != null) {
            return false;
        } else {
            return true;
        }
    }

    public void takePlace(Creature creature) {
        this.takenBy = creature;
    }

    public void leaveItem() {
        this.takenBy = null;
    }

}
