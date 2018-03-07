package com.iteso.nintendo;
/**
 * */
public class Sand implements PokemonType {
    /**
     * */
    private final String pokeTipo = "Sand";
    /**
     * */
    private final String notEffectiveIn = "Grass";
    /**
     * */
    private final String superEffectiveIn = "Flying";
    /**
     * */
    private final String defendingMessage = "Defending... damage caused is:";
    /**
     * */
    private final double defenseUp = 1.5;
    /**
     * */
    private final double defenseDown = 0.5;
    /**
     * */
    @Override
    public final String type() {
        return this.pokeTipo;
    }
    /**
     * */
    @Override
    public final double recievedDamage(final String ataqueTipo,
                                 final double defenseMultiplier) {

        if (ataqueTipo.equals(superEffectiveIn)) {
            return defenseUp * defenseMultiplier;
        } else if (ataqueTipo.equals(notEffectiveIn)) {
            return defenseDown * defenseMultiplier;
        } else {
            return defenseMultiplier;
        }
    }
    /**
     * */
    @Override
    public final String defendMessage() {
        return this.defendingMessage;
    }
}
