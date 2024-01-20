package creatures;

import customExceptions.NoFreeItemException;
import enums.Sounds;
import places.Place;
import places.RoomItem;

public class Shorty extends Person {
    private int height;
    private int hp;
    public Shorty(String name) {
        super(name);
        height = 5;
        hp = 500;
    }
    public void scratch(){
        this.looseHp(5);
        System.out.println("Ой, чешется! Незнайка потерял 5 hp");
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return this.height;
    }
    public void lie(RoomItem item) throws NoFreeItemException {
        if (!item.isFree()) {
            throw new NoFreeItemException("Данный предмет занят другим коротышкой");
        }
        String message = this.getName() + " лежит на " + item.getName();
        System.out.println(message);
    }
    public void hide(Place place) {
        String message = "Тссс..." + this.getName() + " прячется в " + place.getName();
        System.out.println(message);
    }
    @Override
    public String toString() {
        return "Коротышка по имени " + this.getName() + " с " + this.hp + " hp и ростом " + this.height;
    }

    public static void makeNoise(Sounds s) {
        class Sound {
            private int volume;
            private Sounds sound;
            public void setVolume(int volume) {
                this.volume = volume;
            }
            public int getVolume() {
                return volume;
            }
            public Sounds getSound() {
                return this.sound;
            }
            public void setSound(Sounds s) {
                this.sound = s;
            }

            public String toString() {
                if (sound.equals(Sounds.MOAN)) {
                    return "аххххххм";
                }
                else if (sound.equals((Sounds.SCREAM))) {
                    return "АААААААААА";
                }
                else if (sound.equals(Sounds.MOO)){
                    return "мммгмхмммм";
                }
                else {
                    return "ы";
                }
            }
        }
        Sound shortySound = new Sound();
        shortySound.setSound(s);
        System.out.println(shortySound);
    }
}
