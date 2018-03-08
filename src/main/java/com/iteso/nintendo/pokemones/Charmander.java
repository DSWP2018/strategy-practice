package com.iteso.nintendo.pokemones;

import com.iteso.nintendo.tipos.Fuego;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.tipos.PokemonType;
import com.iteso.nintendo.ataques.AtaqueRapido;
import com.iteso.nintendo.ataques.Attacks;
import com.iteso.nintendo.ataques.Lanzallamas;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;
    /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 3;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 17;
    /**
     * */
    private Attacks quickAttack;
    /**
     * */
    private Attacks flamethrower;
    /**
     * */
    private PokemonType charmander;
    /**
     * */
    private Attacks enemyAttack;

    /**
     * Pikachu constructor.
     */
    public Charmander() {
        charmander = new Fuego();
        quickAttack = new AtaqueRapido();
        flamethrower = new Lanzallamas();
        setType(charmander.type());
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(quickAttack);
        setMainAttack(flamethrower);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        setMainAttackDamage(flamethrower);
        setSecondAttackDamage(quickAttack);
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

        damage = (int) (attack * charmander.recievedDamage(
                enemyAttack.attackType(), getDefenseMultiplier()));
        int newHP = getHitPoints() - damage;

        String defendMessage = new String(charmander.defendMessage()
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
        String attackMessage = new String(flamethrower.attackOpponent()
                + " damage: "
                + flamethrower.attackDamage());
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
