package customExceptions;

import places.Room;

public class NoFreeItemException extends Exception{
    public NoFreeItemException(String message) {
        System.out.println("ERROR: " + message);
    }
}
