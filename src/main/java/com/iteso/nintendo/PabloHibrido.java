package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PabloHibrido extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 60;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.6;
    /**
     * Main Attack.
     */
    public final Attack mainAttack;
    /**
     * Second Attack.
     */
    public final Attack secondAttack;

    /**
     * Pikachu constructor.
     */
    public PabloHibrido() {
        mainAttack = new ImpactTrueno();
        secondAttack = new BigFire();

        setType("hybrid");
        setName("Pablo el hibrido");
        setHasEvolution(true);
        setSecondAttack(secondAttack);
        setMainAttack(mainAttack);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(mainAttack.getAttackDamage());
        setSecondAttackDamage(secondAttack.getAttackDamage());
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

        String attackMessage = new String("Attacking opponent with "
                + getSecondAttack()
                + " causing a damage of " + getSecondAttackDamage());
        return attackMessage;


    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String("Attacking opponent with "
                + getMainAttack()
                + " causing a damage of " + getMainAttackDamage());
        return attackMessage;

    }

    @Override
    public final void setNewAttack(final Attack newAttack) {
        if (mainAttack == null) {
            setMainAttack(newAttack);
            setMainAttackDamage(newAttack.getAttackDamage());
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(newAttack.getAttackDamage());
        }
    }


}
