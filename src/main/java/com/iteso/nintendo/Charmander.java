package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * First kind of attack.
     */
    private Attack terremoto = new Terremoto();
    /**
     * Second kind of attack.
     */
    private Attack girobola = new GiroBola();
    /**
     * Type of Pokemon.
     */
    private PokemonType type = new Hierba();
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;

    /**
     * Charmander constructor.
     */
    public Charmander() {
        setType(type);
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(girobola);
        setMainAttack(terremoto);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final Attack attack,
                               final PokemonType attackedby) {
        int damage;
        damage = (int) (attack.getAttackDamage() * (getDefenseMultiplier()
                + this.type.setDefense(attackedby)));
        setHitPoints(getHitPoints() - damage);
        return "Defending attack, damage is " + damage
                + " new HP is " + getHitPoints();
    }

    @Override
    public final String secondAttack() {
        return "Attacking opponent with " + girobola.getAttackName()
                + " causing a damage of " + girobola.getAttackDamage();
    }

    @Override
    public final String mainAttack() {
        return "Attacking opponent with " + terremoto.getAttackName()
                + " causing a damage of " + terremoto.getAttackDamage();

    }

    @Override
    public final void setNewAttack(final Attack attack, final int tochange) {
        if (tochange == 1) {
            setMainAttack(attack);
        } else {
            setSecondAttack(attack);
        }
    }
}
