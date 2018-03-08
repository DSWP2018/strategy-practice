package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Pikachu extends PokemonCharacter {
    /**
     * tipo.
     */
    private final Type electric = new Electric();
    /**
     * First attack.
     */
    private final Attack sparks = new Sparks();
    /**
     * Second attack.
     */
    private final Attack tackle = new Tackle();


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
    public Pikachu() {
        setType(electric);
        setName("Pikachu");
        setHasEvolution(true);
        setSecondAttack(tackle);
        setMainAttack(sparks);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final Attack attack) {

        //0.4*12*2 = 9.6    SuperEfectivo
        //0.4*16*0.5 = 3.2  No efectivo
        //0.4*7*1 =2.8      neutral

        int damage =  (int) (getDefenseMultiplier()
                * attack.getAttackDamage()
                * this.getType().defends(attack));

        //   damage = (int) (attack * getDefenseMultiplier());
        int newHP = (int) (getHitPoints() - damage);

        //100- 10 = 90      SuperEfectivo
        //100-3 = 97        noefectivo
        //100-2 = 98        neutral
        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    /**
     * Hace el 2do ataque.
     * @return mensaje del ataque.
     */
    @Override
    public final String secondAttack() {
        return getSecondAttack().attackOpponent();
    }

    /**
     * Hace el ataque principal.
     * @return mensaje de ataque.
     */
    @Override
    public final String mainAttack() {
        return getMainAttack().attackOpponent();

    }

    /**
     * no hace nada.
     * @return nada.
     */
    @Override
    public final String attackOpponent() {
        return null;
    }

    /**
     * nada.
     * @return nada.
     */
    @Override
    public final String getAttackType() {
        return null;
    }

    /**
     * nada.
     * @return nada.
     */
    @Override
    public final String getAttackName() {
        return null;
    }

    /**
     * nada.
     * @return nada.
     */
    @Override
    public final int getAttackDamage() {
        return 0;
    }

    /**
     * nada.
     * @param attack n/a.
     * @return nada.
     */
    @Override
    public final double defends(final Attack attack) {
        return 0;
    }
}

