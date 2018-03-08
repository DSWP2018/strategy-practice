package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public abstract class PokemonCharacter{

     /**
     * Pokemon name.
     */
     private String name = null;
    /**
     * Pokemon type.
     */
    private Type type= null;
    /**
     * Indicator of evolution.
     */
    private boolean hasEvolution = false;
    /**
     *
     */
    private Attack mainAttack;
    private Attack secondAttack;
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
     * Set name of main attack.
     * @param newMainAttack new main attack name.
     */
    public final void setMainAttack(final Attack newMainAttack) {
        this.mainAttack = newMainAttack;
    }

    /**
     * Get name of second attack.
     * @return name of second attack.
     */
    public final Attack getSecondAttack() {
        return secondAttack;
    }

    /**
     * Set name of second attack.
     * @param newSecondAttack new second attack name.
     */
    public final void setSecondAttack(final Attack newSecondAttack) {
        this.secondAttack = newSecondAttack;
    }

    /**
     * Get damage of main attack.
     * @return main attack damage.
     */
    public final int getMainAttackDamage() {
        return (int)(mainAttack.getAttackDamage()*type.getDamageMultiplier());
    }
    /**
     * Get second attack damage.
     * @return second attack damage.
     */
    public final int getSecondAttackDamage() {
        return (int)(secondAttack.getAttackDamage()*type.getDamageMultiplier());
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
