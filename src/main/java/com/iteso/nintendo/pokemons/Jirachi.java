package com.iteso.nintendo.pokemons;

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

    public Jirachi() {
        lifePoints = 200;
        defense = 0.20;
        type = new Steel();
        mainAttack = new FlashCannon();
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
}