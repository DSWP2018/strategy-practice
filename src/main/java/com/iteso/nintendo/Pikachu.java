package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Pikachu extends PokemonCharacter {
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
    private Attacks quickAttack;
    private Attacks thunderVolt;

    /**
     * Pikachu constructor.
     */
    public Pikachu() {
        quickAttack = new AtaqueRapido();
        thunderVolt = new Impactrueno();
        setType("electric");
        setName("Pikachu");
        setHasEvolution(true);
        setSecondAttack(thunderVolt);
        setMainAttack(quickAttack);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(quickAttack);
        setSecondAttackDamage(thunderVolt);
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
        String attackMessage = new String(thunderVolt.attackOpponent()+" damage: "+thunderVolt.attackDamage());
        return attackMessage;
    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String(quickAttack.attackOpponent()+" damage: "+quickAttack.attackDamage());
        return attackMessage;

    }

    @Override
    public void setNewAttack(int attack, Attacks attackDamage, Attacks newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }


}
