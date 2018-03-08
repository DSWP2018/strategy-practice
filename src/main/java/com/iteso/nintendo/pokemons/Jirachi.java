package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.FlashCannon;
import com.iteso.nintendo.attacks.ZenHeadbutt;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.Steel;

public class Jirachi {

    private int lifePoints;
    private double defense;
    private Attack mainAttack;
    private Attack secondAttack;
    private PokemonType type;
    private boolean evolve;

    public Jirachi(PokemonType pokemonType, Attack mainAttack, Attack secondAttack) {
        lifePoints = 200;
        defense = 0.20;
        type = new Steel();
        this.mainAttack = new FlashCannon();
        this.secondAttack = new ZenHeadbutt();
        evolve = false;

    }

    public String defend(final Attack attack, final PokemonType Type, int attackDamage) {
        int damage;
        double typeAdv = 1;

        if (attack.attackType()== "Ground"){
            typeAdv = 2;
        }

        if (attack.attackType() == "Steel" || attack.attackType() == "Psychihc" ){
            typeAdv = 0.5;
        }

        damage = (int) ((attack.attackDamage() * typeAdv) - (attack.attackDamage() * defense));
        int HP = lifePoints - damage;

        String Message = new String("Defended the attack, it caused " + damage + ". HP is " + HP);

        lifePoints = HP;
        return Message;
    }

    public final String evolve() {
        return null;
    }

    public FlashCannon getMainAttack() {
        return null;
    }

    public FlashCannon getSecondAttack() {
        return null;
    }

    public String getName() {
        return "Jirachi";
    }

    public double getDefense() {
        return defense;
    }

    public String getType() {
        return "Steel";
    }
}