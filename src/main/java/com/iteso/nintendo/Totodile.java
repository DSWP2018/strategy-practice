package com.iteso.nintendo;

public class Totodile extends PokemonCharacter {
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
    private Attacks terremoto;
    /**
     * Pikachu constructor.
     */
    public Totodile() {
        quickAttack = new AtaqueRapido();
        terremoto = new Terremoto();
        setType("Water");
        setName("Totodile");
        setHasEvolution(true);
        setSecondAttack(quickAttack.attackName()); //
        setMainAttack(terremoto.attackName()); //
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(quickAttack.attackDamage()); //
        setSecondAttackDamage(terremoto.attackDamage()); //
    }

    @Override
    public String evolve() {
        return null;
    }

    @Override
    public String defend(int attackDamage) {
        return null;
    }

    @Override
    public String secondAttack() {
        return null;
    }

    @Override
    public String mainAttack() {
        return null;
    }

    @Override
    public void setNewAttack(int attack, int attackDamage, String newAttack) {

    }
}
