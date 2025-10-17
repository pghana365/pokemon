package pokemon;

public class Vulpix extends Fire {
    private int specialMoveDamage;

    public Vulpix() {
        super("Vulpix", 45);
        this.specialMoveDamage = 25;
    }

    public int getSpecialMoveDamage() {
        return specialMoveDamage;
    }
}