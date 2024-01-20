package places;

import java.util.ArrayList;

public class Hotel extends Place{
    private int price;
    private int roomsAmount;
    private double rating;
    private ArrayList<Room> rooms;
    Hotel(String name) {
        super(name);
        this.price = 1000;
        this.roomsAmount = 5;
        this.rooms = new ArrayList<Room>(roomsAmount);
        this.rating = 1.0;
    }
    Hotel(String name, int price) {
        super(name);
        this.price = price;
        this.roomsAmount = 5;
        this.rooms = new ArrayList<Room>(roomsAmount);
        this.rating = 1.0;
    }
    Hotel(String name, int price, int rooms) {
        super(name);
        this.price = price;
        this.roomsAmount = rooms;
        this.rooms = new ArrayList<Room>(roomsAmount);
        this.rating = 1.0;
    }
    Hotel(String name, int price, int rooms, double rating) {
        super(name);
        this.price = price;
        this.roomsAmount = rooms;
        this.rooms = new ArrayList<Room>(roomsAmount);
        this.rating = rating;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRoomsAmount(int rooms) {
        this.roomsAmount = rooms;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public int getRoomsAmount() {
        return this.roomsAmount;
    }
    public int getPrice() {
        return this.price;
    }
    public double getRating() {
        return this.rating;
    }
}
