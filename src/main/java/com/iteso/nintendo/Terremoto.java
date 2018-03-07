package com.iteso.nintendo;

/**
 * Tipo de ataque que implementa a la clase de Attack.
 */
public class Terremoto implements Attack {
    /**
     * Daño que causa el ataque.
     */
    private final int attackDamage = 21;

    @Override
    public final String getAttackName() {
        return "Terremoto";
    }

    @Override
    public final int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public final String attackOpponent(final PokemonType type,
                                       final PokemonCharacter character) {
        return "Attack " + character.getName()
                + "with " + getAttackName()
                + "to cause a damage of " + type.setDamage(character.getType());
    }

    @Override
    public final String cancelAttack() {
        return "Ataque cancelado";
    }
}
