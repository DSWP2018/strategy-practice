package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Raichu extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;

    /**
     * Pikachu constructor.
     */
    public Raichu() {
        setType(new Electric());
        setName("Raichu");
        setHasEvolution(true);
        setSecondAttack(new ImpactTrueno());
        setMainAttack(new QuickAttack());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final Attack attack) {
        int damage;
        String defendMessage;
        if (getType() instanceof Electric) {
            damage = (int) ((attack.getAttackDamage()
                    - 3)
                    * getDefenseMultiplier()
                    + 1);

            int newHP = getHitPoints() - damage;

            defendMessage = new String("Defending attack,"
                    + " damage caused is "
                    + damage
                    + " new HP is "
                    + newHP);

            setHitPoints(newHP);
        } else if (getType() instanceof Fire) {
            damage = (int) (attack.getAttackDamage()
                    * (getDefenseMultiplier()
                    + 2));

            int newHP = getHitPoints()
                    - damage;

            defendMessage = new String("Defending attack,"
                    + " damage caused is "
                    + damage
                    + " new HP is "
                    + newHP);

            setHitPoints(newHP);
        } else if (getType() instanceof Water) {
            damage = (int) ((attack.getAttackDamage()
                    + 3)
                    * getDefenseMultiplier());

            int newHP = getHitPoints() - damage;

            defendMessage = new String("Defending attack,"
                    + " damage caused is "
                    + damage
                    + " new HP is "
                    + newHP);

            setHitPoints(newHP);
        } else {
            damage = (int) (attack.getAttackDamage()
                    * getDefenseMultiplier());

            int newHP = getHitPoints() - damage;

            defendMessage = new String("Defending attack, "
                    + "damage caused is "
                    + damage
                    + " new HP is "
                    + newHP);

            setHitPoints(newHP);
        }
        return defendMessage;

    }

    @Override
    final public String secondAttack() {
        return getSecondAttack().attackOpponent();
    }

    @Override
    final public String mainAttack() {
        return getMainAttack().attackOpponent();
    }

    @Override
    final public void setNewAttack(final int attack, final Attack newAttack) {
        if(attack == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }


}
