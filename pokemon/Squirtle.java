package pokemon;

public class Squirtle extends Water {
    private int specialMoveDamage;

    public Squirtle() {
        super("Squirtle", 55);
        this.specialMoveDamage = 15;
    }

    public int getSpecialMoveDamage() {
        return specialMoveDamage;
    }
}