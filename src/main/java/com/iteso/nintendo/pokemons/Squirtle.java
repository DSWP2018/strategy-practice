package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Water;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.WaterType;

public class Squirtle {

    private int lifePoints;
    private double defense;
    private PokemonType type;
    private Attack mainAttack;
    private Attack secondAttack;
    private boolean evolve;

    public Squirtle() {
        lifePoints = 200;
        defense = 0.20;
        type = new WaterType();
        mainAttack = new Water();
        secondAttack = new Bite();
        evolve = true;
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
