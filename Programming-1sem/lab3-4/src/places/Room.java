package places;

import java.util.ArrayList;

public class Room extends Place{
    private int floor;
    private int places;
    private final double ratsChance = 0.4;
    private ArrayList<RoomItem> items = new ArrayList<RoomItem>();
    public Room() {
        this.floor = 1;
        this.places = 2;
    }
    public Room(int floor, int places) {
        this.floor = floor;
        this.places = places;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public void addItem(RoomItem item){
        items.add(item);
    }
    public ArrayList<RoomItem> getItems() {
        return items;
    }
    public boolean checkRats() {
        return (Math.random() > ratsChance);
    }

}
