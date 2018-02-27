package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter{
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
    private Attacks quickAttack;
    private Attacks flamethrower;

    /**
     * Pikachu constructor.
     */
    public Charmander() {
        quickAttack = new AtaqueRapido();
        flamethrower = new Lanzallamas();
        setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(quickAttack.attackName());
        setMainAttack(flamethrower.attackName());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(flamethrower.attackDamage());
        setSecondAttackDamage(quickAttack.attackDamage());
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

        String attackMessage = new String(quickAttack.attackOpponent()+" damage: "+quickAttack.attackDamage());
        return attackMessage;


    }

    @Override
    public final String mainAttack() {
        String attackMessage = new String(flamethrower.attackOpponent()+" damage: "+flamethrower.attackDamage());
        return attackMessage;
    }

    @Override
    public final void setNewAttack(final int attack, final int attackDamage,
                                   final String newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }


}
