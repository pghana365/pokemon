package trainer;

import pokemon.Pokemon;

public class Trainer {
    private String name;
    private Pokemon[] pokemons = new Pokemon[6];
    private int badgeCount = 3;

    public Trainer(String name) {
        this.name = name;
    }

    public void addPokemon(int slot, Pokemon pokemon) {
        if (slot >= 0 && slot < 6) {
            pokemons[slot] = pokemon;
        }
    }

    public String getName() {
        return name;
    }

    public Pokemon getPokemon(int index) {
        if (index >= 0 && index < 6) {
            return pokemons[index];
        }
        return null;
    }

    public int getBadgeCount() {
        return badgeCount;
    }

    public void incrementBadgeCount() {
        badgeCount++;
    }

    public void decrementBadgeCount() {
        badgeCount--;
        if (badgeCount <= 0) {
            name = name + " (Eliminated)";
        }
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public void setBadgeCount(int badgeCount) {
        this.badgeCount = badgeCount;
    }
}