package com.iteso.nintendo;

/**
 * Created by FedericoIbarra on 2/26/18.
 */
public class Rayquaza extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;
    /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 5;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 15;
    /**
     * Ataque principal.
     */
    private final HurracarranaAttack mainAttack = new HurracarranaAttack();
    /**
     * Ataque secundario.
     */
    private final ImpactTrueno secondAttack = new ImpactTrueno();

    /**
     * Pikachu constructor.
     */
    public Rayquaza() {
        setType("Legendary");
        setName("Rayquaza");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final int attack) {
        int damage;

        damage = (int) (attack * getDefenseMultiplier());
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    @Override
    public final String secondAttack() {
        return secondAttack.performAttack();
    }

    @Override
    public final String mainAttack() {
        return mainAttack.performAttack();
    }




}
