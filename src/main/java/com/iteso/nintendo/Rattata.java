package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Rattata extends PokemonCharacter {

    /**
     * Tipo.
     */
    private final Type normal = new Normal();
    /**
     * Primer ataque.
     */
    private final Attack tackle = new Tackle();
    /**
     * Second attack.
     */
    private final Attack scratch = new Scratch();
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 51;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.5;

    /**
     * rattata constructor.
     */
    public Rattata() {
        setType(normal);
        setName("Rattata");
        setHasEvolution(true);
        setSecondAttack(tackle);
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

            //0.5*12*2 = 12    SuperEfectivo
            //0.5*16*0 = 0  No efectivo
            //0.5*7*1 = 3     neutral

            int damage =  (int) (getDefenseMultiplier()
                    * attack.getAttackDamage()
                    * this.getType().defends(attack));

            //   damage = (int) (attack * getDefenseMultiplier());
            int newHP = (int) (getHitPoints() - damage);

            //51- 12 = 39      SuperEfectivo
            //51-0 = 51        noefectivo
            //51-3 = 48        neutral
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

    /**
     * nada.
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
