package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.ZenHeadbutt;
import com.iteso.nintendo.types.Fairy;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.Steel;

public class Sylveon {

    private int lifePoints;
    private double defense;
    private Attack mainAttack;
    private Attack secondAttack;
    private PokemonType type;
    private boolean evolve;

    public Sylveon() {
        lifePoints = 130;
        defense = 0.10;
        type = new Fairy();
        mainAttack = new ZenHeadbutt();
        secondAttack = new ZenHeadbutt();
        evolve = false;

    }

    public String attackWithMain() {
        return mainAttack.attack();
    }

    public String attackWithSecond() {
        return secondAttack.attack();
    }

    public final String defend(final Attack attack, final PokemonType Type) {
        int damage;
        double typeAdv = 1;

        if (attack.attackType()== "Steel"){
            typeAdv = 2;
        }


        damage = (int) ((attack.attackDamage() * typeAdv) - (attack.attackDamage() * defense));
        int HP = lifePoints - damage;

        String Message = new String("Defended the attack, it caused " + damage + ". HP is " + HP);

        lifePoints = HP;
        return Message;
    }
}