package com.iteso.nintendo;

/**
 * Tipo de ataque que implementa a la clase de Attack.
 */
public class GiroBola implements Attack {
    /**
     * Daño que causa el ataque.
     */
    private final int attackDamage = 5;

    @Override
    public final String getAttackName() {
        return "Giro bola";
    }

    @Override
    public final int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public final String attackOpponent(final PokemonType type,
                                       final PokemonCharacter character) {
        return "Attack opponent with " + getAttackName()
                + " to cause a damage of " + (getAttackDamage()
                + type.setDamage(character.getType()));
    }

    @Override
    public final String cancelAttack() {
        return "Ataque cancelado";
    }
}
