package pokemon;

public class Chikorita extends Grass {
    private int specialMoveDamage;

    public Chikorita() {
        super("Chikorita", 40);
        this.specialMoveDamage = 18;
    }

    public int getSpecialMoveDamage() {
        return specialMoveDamage;
    }
}