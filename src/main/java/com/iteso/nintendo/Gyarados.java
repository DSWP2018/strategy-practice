package com.iteso.nintendo;

public class Gyarados extends PokemonCharacter {
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
    public Gyarados() {
        quickAttack = new AtaqueRapido();
        terremoto = new Terremoto();
        setType("Water");
        setName("Gyarados");
        setHasEvolution(true);
        setSecondAttack(quickAttack); //
        setMainAttack(terremoto); //
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(terremoto); //
        setSecondAttackDamage(quickAttack); //
    }

    @Override
    public String evolve() {
        return null;
    }

    @Override
    public String defend(int attackDamage) {
        int damage;

        damage = (int) (attackDamage * getDefenseMultiplier());
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;
    }

    @Override
    public String secondAttack() {
        String attackMessage = new String(quickAttack.attackOpponent()+" damage: "+quickAttack.attackDamage());
        return attackMessage;
    }

    @Override
    public String mainAttack() {
        String attackMessage = new String(terremoto.attackOpponent()+" damage: "+terremoto.attackDamage());
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
