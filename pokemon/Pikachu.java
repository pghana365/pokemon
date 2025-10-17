package pokemon;

public class Pikachu extends Electric {
    private int specialMoveDamage;

    public Pikachu() {
        super("Pikachu", 50);
        this.specialMoveDamage = 30;
    }

    public int getSpecialMoveDamage() {
        return specialMoveDamage;
    }
}