package creatures;

public class Bug extends Animal{
    public  static String[] names = {"Клопандр", "Клопантон", "Клополайзер", "Клопикс",
            "Клопотрон", "Клопофей", "Клоподин", "Клопохвост", "Клопошник",
            "Клопозавр", "Клопогон", "Клопоман", "Клоподав", "Клопокрыл",
            "Клоподром", "Клопозуб", "Клопоскакун", "Клопоморф", "Клопокрыс",
            "Клопошмыг", "Клопозверь",
            "Клоподрыг", "Клопоскворец", "Клопохруст", "Клопотень"};
    public Bug() {
        super("bug");
    }
    public Bug(String name) {
        super("bug", name);
    }
    public void setRandomName(){
        int ind = (int)(Math.random() * names.length);
        this.setName(names[ind]);
    }
}
