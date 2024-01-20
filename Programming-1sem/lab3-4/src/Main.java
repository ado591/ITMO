import actions.DepressedBattle;
import creatures.*;
import actions.Battle;
import customExceptions.NoFreeItemException;
import enums.Clothes;
import enums.Colors;
import enums.Sex;
import enums.Sounds;
import other.Sickness;
import places.RoomItem;

public class Main {
    public static void main(String[] args) throws NoFreeItemException{
        Shorty mainShorty = new Shorty("Незнайка");
        mainShorty.wear(Clothes.JACKET);
        mainShorty.wear(Clothes.PANTS);

        RoomItem shelf = new RoomItem("полка");
        shelf.fromMaterial("дерево");
        mainShorty.lie(shelf);

        BugArmy enemies = new BugArmy(15);
        Battle battle = new Battle();
        battle.startFight(mainShorty, enemies);

        RoomItem floor = new RoomItem("пол");
        floor.fromMaterial("дерево");
        mainShorty.sit(floor);
        mainShorty.sleep();
        mainShorty.wakeUp();
        Rat rat = new Rat("Крысюк", Sex.MALE, 150, Colors.GREY);
        System.out.println(rat);
        rat.smell(mainShorty);
        //lab 4
        rat.run(floor);
        Rat.Eye ratEye = rat.new Eye();
        Rat.Nose ratNose = rat.new Nose();
        ratNose.setSize("маленький и длинный");
        ratEye.setColor("блестящие");
        rat.lookAt(mainShorty, ratEye);
        Shorty npc1 = new Shorty("Хитрюша");
        shelf.takePlace(npc1);
        try {
            mainShorty.lie(shelf);
        }
        catch (NoFreeItemException e) {
            shelf.leaveItem();
            mainShorty.lie(shelf);
            shelf.takePlace(mainShorty);
        }
        DepressedBattle newBattle = new DepressedBattle();
        newBattle.setTurnAmount(5);
        newBattle.startFight(mainShorty, new BugArmy(25));
        Shorty npc2 = new Shorty("Домовеныш");
        Shorty npc3 = new Shorty("Усталыш");
        npc1.sleep();
        npc2.sleep();
        npc3.sleep();
        Sickness.Caught khe = new Sickness.Caught();
        khe.startCaught(npc2);
        Shorty.makeNoise(Sounds.SCREAM);
        Shorty.makeNoise(Sounds.MOAN);
        Shorty.makeNoise(Sounds.MOO);
        Shorty terrifiedShorty = new Shorty("Бессонник") {
            @Override
            public void sleep() {
                System.out.println("Ой! " + this.getName() + " снится кошмар!");
                makeNoise(Sounds.SCREAM);
            }
        };
        terrifiedShorty.sleep();
    }
}