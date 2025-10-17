package pokemon;

public class Greninja extends Water {
    private int specialMoveDamage;

    public Greninja() {
        super("Greninja", 60);
        this.specialMoveDamage = 25;
    }

    public int getSpecialMoveDamage() {
        return specialMoveDamage;
    }
}