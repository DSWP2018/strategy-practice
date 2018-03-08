package com.iteso.nintendo.pokemones;

import com.iteso.nintendo.tipos.Electricidad;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.tipos.PokemonType;
import com.iteso.nintendo.ataques.AtaqueRapido;
import com.iteso.nintendo.ataques.Attacks;
import com.iteso.nintendo.ataques.Impactrueno;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Pikachu extends PokemonCharacter {
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
    private Attacks thunderVolt;
    /**
     * */
    private PokemonType pikachu;
    /**
     * */
    private Attacks enemyAttack;

    /**
     * Pikachu constructor.
     */
    public Pikachu() {
        pikachu = new Electricidad();
        quickAttack = new AtaqueRapido();
        thunderVolt = new Impactrueno();
        setType(pikachu.type());
        setName("Pikachu");
        setHasEvolution(true);
        setSecondAttack(thunderVolt);
        setMainAttack(quickAttack);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(quickAttack);
        setSecondAttackDamage(thunderVolt);
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

        damage = (int) (attack * pikachu.recievedDamage(
                enemyAttack.attackType(), getDefenseMultiplier()));
        int newHP = getHitPoints() - damage;

        String defendMessage = new String(pikachu.defendMessage()
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
        String attackMessage = new String(thunderVolt.attackOpponent()
                + " damage: "
                + thunderVolt.attackDamage());
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