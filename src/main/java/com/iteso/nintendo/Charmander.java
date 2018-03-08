package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {

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
    private final Attack rage = new Rage();
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;

    /**
     * Charmander constructor.
     */
    public Charmander() {
        setType(fire);
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(ember);
        setMainAttack(rage);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    /**
     * Evoluciona a charmander.
     * @return nulo.
     */
    @Override
    public final String evolve() {
        return null;
    }

    /**
     * Obtiene el parámetro de cuanto se defiende y lo multiplica por el
     * daño del ataque particular.
     * defenseMultiplier disminuye más el daño
     * @param attack Attack sent by opponent.
     * @return mensaje de defensa y HP restante.
     */
    @Override
    public final String defend(final Attack attack) {

        //0.3*12*2 = 7.2    SuperEfectivo
        //0.3*16*0.5 = 2.4  No efectivo
        //0.3*7*1 =2.1      neutral

        int damage =  (int) (getDefenseMultiplier()
                * attack.getAttackDamage()
                * this.getType().defends(attack));

        //   damage = (int) (attack * getDefenseMultiplier());
        int newHP = (int) (getHitPoints() - damage);

        //77 - 7 = 70      SuperEfectivo
        //77 - 2 = 75        noefectivo
        //77 -2 = 75        neutral
        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    /**
     * Pone el ataque secundario.
     * @return cadena que describe el ataque
     */
    @Override
        public final String secondAttack() {
            return getSecondAttack().attackOpponent();
        }

    /**
     * Pone el ataque principal.
     * @return cadena que describe el ataque.
     */
    @Override
    public final String mainAttack() {
        return getMainAttack().attackOpponent();
        }

    /**
     * No hace nada pero debe implementarse.
     * @return n/a.
     */
    @Override
    public final String attackOpponent() {
        return null;
    }

    /**
     * no hace nada.
     * @return n/a.
     */
    @Override
    public final String getAttackType() {
        return null;
    }

    /**
     * no hace nada.
     * @return n/a.
     */
    @Override
    public final String getAttackName() {
        return null;
    }

    /**
     * no hace nada.
     * @return n/a.
     */
    @Override
    public final int getAttackDamage() {
        return 0;
    }

    /**
     * no hace nada.
     * @param attack a.
     * @return b.
     */
    @Override
    public final double defends(final Attack attack) {
        return 0;
    }
}
