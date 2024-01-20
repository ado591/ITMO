package actions;
import places.Place;
import places.RoomItem;

public interface Actions {
    void run(RoomItem item);
    void eat(String food);
    void jump(Place start, Place finish);
    void sit(RoomItem item);
    void sleep();
    void wakeUp();
}
