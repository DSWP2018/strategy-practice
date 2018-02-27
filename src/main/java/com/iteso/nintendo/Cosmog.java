package com.iteso.nintendo;

public class Cosmog extends PokemonCharacter{
	Attack combate=new Combate();
	Attack cascada=new Cascada();
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;
    /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 3;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 17;

    /**
     * Pikachu constructor.
     */
    public Cosmog() {
        setType("fire");
        setName("Cosmog");
        setHasEvolution(true);
        setSecondAttack(cascada);
        setMainAttack(combate);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage();
        setSecondAttackDamage();
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

    public final String secondAttack() {
        return combate.getAttack();
    }

    @Override
    public final String mainAttack() {
        return cascada.getAttack();
    }

    @Override
    public final void setNewAttack(final int attack,
                                   final Attack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage();
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage();
        }
    }



}
