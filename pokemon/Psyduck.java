package pokemon;

public class Psyduck extends Water {
    private int specialMoveDamage;

    public Psyduck() {
        super("Psyduck", 35);
        this.specialMoveDamage = 30;
    }

    public int getSpecialMoveDamage() {
        return specialMoveDamage;
    }
}