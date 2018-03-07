package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.FireBall;
import com.iteso.nintendo.types.FireType;
import com.iteso.nintendo.types.PokemonType;

public class Charizard {

    private int lifePoints;
    private double defense;
    private Attack mainAttack;
    private Attack secondAttack;
    private PokemonType type;
    private boolean evolve;

    public Charizard() {
        lifePoints = 200;
        defense = 0.20;
        type = new FireType();
        mainAttack = new FireBall();
        secondAttack = new Bite();
        evolve = false;

    }

    public Attack attack(int option){

        if (option == 1) {
            return mainAttack;
        } else if (option == 2) {
            return secondAttack;
        } else {
            return null;
        }
    }

    public String defend(Attack attack, PokemonType opponentType) {

        if (attack == null) {
            return "Attack is null.";
        }

        String msg;
        double damageReceived;

        if (opponentType.pokemonType().equals(type.pokemonWeakness())) {
            damageReceived = attack.attackDamage() * 2;
        } else {
            damageReceived = attack.attackDamage() - (attack.attackDamage() * defense);
        }

        if (this.lifePoints > 0) {
            this.lifePoints -= damageReceived;

            msg = "Attack " + attack.attackName() + " received with a damage of " + damageReceived + ".\n" +
                    "LIFEPOINTS: " + lifePoints + ".";
        } else {
            msg = "Pokemon defeated, cannot fight anymore.";
        }


        return msg;
    }

    public String evolve() {
        if (evolve) {
            return "is evolving";
        } else {
            return "can not evolve";
        }
    }

}
