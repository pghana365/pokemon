package pokemon;

public class Charmander extends Fire {
    private int specialMoveDamage;

    public Charmander() {
        super("Charmander", 50);
        this.specialMoveDamage = 20;
    }

    public int getSpecialMoveDamage() {
        return specialMoveDamage;
    }
}