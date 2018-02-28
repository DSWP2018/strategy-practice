package com.iteso.nintendo;

/**
 * Interface for attacks.
 */
public interface AttackBehavior {
    /**
     * Method to attack an opponent.
     * @param opponent Opponent to attack.
     * @return Result of the attack.
     */
    String attackOpponent(PokemonCharacter opponent);
    /**
     * Method to get damage of the attack.
     * @return Value of damage.
     */
    int getDamage();
    /**
     * Method to get attack name.
     * @return Name of the attack.
     */
    String getName();
    /**
     * Method to get attack type.
     * @return Name of the attack type.
     */
    String getType();
}
