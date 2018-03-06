package com.iteso.nintendo;

public class Volador implements PokemonType {
    private final String ATAQUE_TIPO = "Flying";
    private final String NOT_EFFECTIVE_IN = "Sand";
    private final String SUPER_EFFECTIVE_IN = "Grass";
    private final String DEFENDING_MESSAGE = "Defending attack, damage caused is: ";
    private final double DEFENSE_UP = 1.5;
    private final double DEFENSE_DOWN = 0.5;

    @Override
    public String attackType() {
        return this.ATAQUE_TIPO;
    }

    @Override
    public double recievedDamage(String ataqueTipo, double defenseMultiplier) {

        if (ataqueTipo.equals(SUPER_EFFECTIVE_IN)) {
            return DEFENSE_UP * defenseMultiplier;
        } else if(ataqueTipo.equals(NOT_EFFECTIVE_IN)) {
            return DEFENSE_DOWN * defenseMultiplier;
        } else {
            return defenseMultiplier;
        }
    }

    @Override
    public String defendMessage() {
        return this.DEFENDING_MESSAGE;
    }

}