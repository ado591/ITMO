package places;

import java.util.ArrayList;

public abstract class Place {
    private String name;
    private int area;
    private ArrayList<Room> rooms;
    private ArrayList<RoomItem> items = new ArrayList<RoomItem>();

    public Place() {
        this.name = "unnamed";
        this.area = 1;
    }
    public Place(String name) {
        this.name = name;
        this.area = 1;
    }
    public Place (String name, int area) {
        this.name = name;
        this.area = area;
    }
    public String getName() {
        return this.name;
    }
    public int getArea() {
        return this.area;
    }
}
