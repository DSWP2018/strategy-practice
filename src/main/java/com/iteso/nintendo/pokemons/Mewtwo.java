package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.EnergyBall;
import com.iteso.nintendo.attacks.Thunder;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.PsychicType;

public class Mewtwo {

    private int lifePoints;
    private double defense;
    private PokemonType type;
    private Attack mainAttack;
    private Attack secondAttack;
    private boolean evolve;

    public Mewtwo() {
        lifePoints = 200;
        defense = 0.20;
        type = new PsychicType();
        mainAttack = new EnergyBall();
        secondAttack = new Thunder();
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
