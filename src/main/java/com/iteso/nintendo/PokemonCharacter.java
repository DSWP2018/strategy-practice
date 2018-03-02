package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public abstract class PokemonCharacter {

    /**
     * Pokemon name.
     */
    private String name = null;
    /**
     * Pokemon type.
     */
    private PokemonType type = null;
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
     * @param attackDamage Amount of damage to defend.
     * @return Result of defense.
     */
    public abstract String defend(int attackDamage);

    /**
     * Pokemon type.
     * @return water, fire, normal, electric, plant, bug, etc.
     */
    public final String getType() {
        return type.getType();
    }

    /**
     * Set new pokemon type.
     * @param newType new pokemon type.
     */
    public final void setType(final PokemonType newType) {
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
     * Set main attack.
     * @param newMainAttack new main attack.
     */
    public final void setMainAttack(final Attack newMainAttack) {
        this.mainAttack = newMainAttack;
    }

    /** Method getMainAttack. /*
     *
     * @return the name of the main attack.
     */
    public final String getMainAttack() {
        return this.mainAttack.getAttack();
    }

    /** Method getSecondAttack. /*
     * @return String with the name of the second attack.
     */
    public final String getSecondAttack() {
        return this.secondAttack.getAttack();
    }

    /**
     * Set name of second attack.
     * @param newSecondAttack new second attack name.
     */
    public final void setSecondAttack(final Attack newSecondAttack) {
        this.secondAttack = newSecondAttack;
    }

    /** Method getMainAttackDamage. /*
     *
      * @return The number of attack damage of the main attack.
     */
    public final int getMainAttackDamage() {
        return this.mainAttack.getAttackDamage();
    }

    /** Method getSecondAttackDamage. /*
     *
     * @return The number of attack damage of the second attack.
     */
    public final int getSecondAttackDamage() {
        return this.secondAttack.getAttackDamage();
    }

    /**
     * Get defense multiplier.
     * @return defense multiplier.
     */
    public final double getDefenseMultiplier() {
        return type.getDefenseMultiplier();
    }

    /**
     * Get damage multiplier.
     * @return damage multiplier.
     */
    public final double getDamageMultiplier() {
        return type.getDamageMultiplier();
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
