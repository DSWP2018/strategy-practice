package com.iteso.nintendo;
/**
 * */
public class Lugia extends PokemonCharacter {
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
    /**
     * */
    private Attacks quickAttack;
    /**
     * */
    private Attacks terremoto;
    /**
     * */
    private PokemonType lugia;
    /**
     * */
    private Attacks enemyAttack;
    /**
     * Pikachu constructor.
     */
    public Lugia() {
        lugia = new Agua();
        quickAttack = new AtaqueRapido();
        terremoto = new Terremoto();
        setType(lugia.type());
        setName("Lugia");
        setHasEvolution(true);
        setSecondAttack(quickAttack); //
        setMainAttack(terremoto); //
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(terremoto); //
        setSecondAttackDamage(quickAttack); //
    }
    /**
     * */
    @Override
    public final String evolve() {
        return null;
    }
    /**
     * */
    @Override
    public final String defend(final int attack) {
        int damage;

        damage = (int) (attack * lugia.recievedDamage(
                enemyAttack.attackType(), getDefenseMultiplier()));
        int newHP = getHitPoints() - damage;

        String defendMessage = new String(lugia.defendMessage()
                + damage
                + " new HP is "
                + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }
    /**
     * */
    @Override
    public final String secondAttack() {

        String attackMessage = new String(quickAttack.attackOpponent()
                + " damage: "
                + quickAttack.attackDamage());
        return attackMessage;

    }
    /**
     * */
    @Override
    public final String mainAttack() {
        String attackMessage = new String(terremoto.attackOpponent()
                + " damage: "
                + terremoto.attackDamage());
        return attackMessage;
    }
    /**
     * */
    @Override
    public final void setNewAttack(final int attack,
                                   final Attacks attackDamage,
                                   final Attacks newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }

}
