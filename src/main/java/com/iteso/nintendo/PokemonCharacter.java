package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public abstract class PokemonCharacter implements Attack, Type {

    /**
     * Pokemon name.
     */
    private String name = null;
    /**
     * Pokemon type.
     */
    private Type type = null;
    /**
     * Indicator of evolution.
     */
      private boolean hasEvolution = false;
    /**
     * Main attack name.
     */
    private Attack mainAttack = null;
    /**
     * Second attack name.
     */
    private Attack secondAttack = null;

    /**
     * Multiplier to calculate damage received.
     */
    private double defenseMultiplier = 0;
    /**
     * Pokemon life.
     */
      private int hitPoints = 0;

    /**
     * Get pokemon name.
     * @return Name.
     */
    public final String getName() {
        return name;
    }

    /**
     * Set pokemon name.
     * @param newName New name.
     */
    public final void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Method to perform evolution.
     * @return Result of evolution.
     */
    public abstract String evolve();

    /**
     * Method to defend an attack.
     * @param attack Attack sent by opponent.
     * @return Result of defense.
     */
    public abstract String defend(Attack attack);

    /**
     * Method to perform second attack.
     * @return Result of attack.
     */
    public abstract String secondAttack();

    /**
     * Method to perform main attack.
     * @return Result of main attack.
     */
    public abstract String mainAttack();

    /**
     * Method to set the Main Attack.
     * @param attack Attack name and damage.
     */
    public final void setMainAttack(final Attack attack) {
        this.mainAttack = attack;
    }

    /**
     *  Method to set the secondary attack.
     * @param attack Attack name and damage.
     */
    public final void setSecondAttack(final Attack attack) {
        this.secondAttack = attack;
    }

    /**
     * Pokemon type.
     * @return water, fire, normal, electric, plant, bug, etc.
     */
    public final Type getType() {
        return this.type;
    }

    /**
     * Set new pokemon type.
     * @param newType new pokemon type.
     */
    public final void setType(final Type newType) {
        this.type = newType;
    }

    /**
     * Indicate if pokemon can be evolved.
     * @return true or false.
     */
    public final boolean isHasEvolution() {
        return hasEvolution;
    }

    /**
     * Set indicator of evolution.
     * @param evolution set to true if pokemon can be evolved.
     */
    public final void setHasEvolution(final boolean evolution) {
        this.hasEvolution = evolution;
    }

    /**
     * Get name of main attack.
     * @return main attack name.
     */
    public final Attack getMainAttack() {
        return mainAttack;
    }

    /**
     * Get name of second attack.
     * @return name of second attack.
     */
    public final Attack getSecondAttack() {
        return secondAttack;
    }

    /**
     * Get defense multiplier.
     * @return defense multiplier.
     */
    public final double getDefenseMultiplier() {
        return defenseMultiplier;
    }

    /**
     * Set new defense mul;tiplier.
     * @param newDefenseMultiplier new defense multiplier.
     */
    public final void setDefenseMultiplier(final double newDefenseMultiplier) {
        this.defenseMultiplier = newDefenseMultiplier;
    }

    /**
     * Get hit points.
     * @return hit points.
     */
    public final int getHitPoints() {
        return hitPoints;
    }

    /**
     * Set new het points.
     * @param newHitPoints new hit points.
     */
    public final void setHitPoints(final int newHitPoints) {
        this.hitPoints = newHitPoints;
    }

}
