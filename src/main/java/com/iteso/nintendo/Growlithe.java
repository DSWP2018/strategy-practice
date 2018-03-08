package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Growlithe extends PokemonCharacter {

    /**
     * Tipo.
     */
    private final Type fire = new Fire();
    /**
     * Primer ataque.
     */
    private final Attack ember = new Ember();
    /**
     * Second attack.
     */
    private final Attack scratch = new Scratch();
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 70;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.6;

    /**
     * Growlithe constructor.
     */
    public Growlithe() {
        setType(fire);
        setName("Growlithe");
        setHasEvolution(true);
        setSecondAttack(ember);
        setMainAttack(scratch);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

        @Override
        public final String evolve() {
            return null;
        }

        @Override
        public final String defend(final Attack attack) {

            //0.6*12*2 = 14.4    SuperEfectivo
            //0.6*16*0.5 = 4.8  No efectivo
            //0.6*7*1 = 4.2      neutral

            int damage =  (int) (getDefenseMultiplier()
                    * attack.getAttackDamage()
                    * this.getType().defends(attack));

            //   damage = (int) (attack * getDefenseMultiplier());
            int newHP = (int) (getHitPoints() - damage);

            //70- 14 = 56     SuperEfectivo
            //70-4 = 66        noefectivo
            //70-4 = 66        neutral
            String defendMessage = new String(
                    "Defending attack, damage caused is "
                    + damage + " new HP is " + newHP);

            setHitPoints(newHP);
            return defendMessage;

        }

        @Override
        public final String secondAttack() {
            return getSecondAttack().attackOpponent();
        }

        @Override
        public final String mainAttack() {
            return getMainAttack().attackOpponent();

        }

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
