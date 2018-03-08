package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Victini extends PokemonCharacter {

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
    private final Attack sparks = new Sparks();
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 85;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;

    /**
     * victini constructor.
     */
    public Victini() {
        setType(fire);
        setName("Victini");
        setHasEvolution(false);
        setSecondAttack(ember);
        setMainAttack(sparks);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    /**
     * evolucionar.
     * @return
     */
        @Override
        public final String evolve() {
            return null;
        }

    /**
     * defender.
     * @param attack Attack sent by opponent.
     * @return hp nuevo y mensaje de defensa.
     */
        @Override
        public final String defend(final Attack attack) {

            //0.4*12*2 = 9.6     SuperEfectivo
            //0.4*16*0.5 = 3.2      No efectivo
            //0.4*7*1 = 2.8       neutral

            int damage = (int) (getDefenseMultiplier()
                    * attack.getAttackDamage()
                    * this.getType().defends(attack));

            int newHP = (int) (getHitPoints() - damage);

            //85 - 9 = 76      SuperEfectivo
            //85 - 3 = 82       noefectivo
            //85 - 2 = 83        neutral

            String defendMessage = new String(
                    "Defending attack, damage caused is "
                    + damage + " new HP is " + newHP);

            setHitPoints(newHP);
            return defendMessage;

        }

        /**
         * hacer sgundo ataque.
         * @return mensaje.
         */
        @Override
        public final String secondAttack() {
            return getSecondAttack().attackOpponent();
        }

    /**
     * hacer ataque primario.
     * @return mensaje.
     */
    @Override
        public final String mainAttack() {
            return getMainAttack().attackOpponent();

        }

    /**
     * no haces nada.
     * @return asdfsdf
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
