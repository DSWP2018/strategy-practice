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
     * Main attack.
     */
    private PokemonAttack mainAttack = null;
    /**
     * Second attack.
     */
      private PokemonAttack secondAttack = null;
    /**
     * defense Multiplier.
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
     * @param attackDamage Amount of damage to defend.
     * @param opponentType gives the type of the opponent.
     * @return Result of defense.
     */
    public abstract String defend(int attackDamage, PokemonType opponentType);

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
     * Method to change pokemon attack.
     * @param attack Which attack to change.
     * @param newAttack New attack.
     */
    public abstract void setNewAttack(int attack,
                                      PokemonAttack newAttack);

    /**
     * Pokemon type.
     * @return water, fire, normal, electric, plant, bug, etc.
     */
    public final PokemonType getType() {
        return type;
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
     * Get instance of main attack.
     * @return main attack instance.
     */
    public final PokemonAttack getMainAttack() {
        return mainAttack;
    }

    /**
     * Get name of main attack.
     * @return main attack name.
     */
    public final String getMainAttackName() {
        return mainAttack.getAttackName();
    }

    /**
     * Set name of main attack.
     * @param newMainAttack new main attack name.
     */
    public final void setMainAttack(final PokemonAttack newMainAttack) {
        this.mainAttack = newMainAttack;
    }

    /**
     * Get name of second attack.
     * @return name of second attack.
     */
    public final String getSecondAttackName() {
        return secondAttack.getAttackName();
    }

    /**
     * Get instance of second attack.
     * @return instance of second attack.
     */
    public final PokemonAttack getSecondAttack() {
        return secondAttack;
    }
    /**
     * Set name of second attack.
     * @param newSecondAttack new second attack name.
     */
    public final void setSecondAttack(final PokemonAttack newSecondAttack) {
        this.secondAttack = newSecondAttack;
    }

    /**
     * Get damage of main attack.
     * @return main attack damage.
     */
    public final int getMainAttackDamage() {
        return mainAttack.getAttackDamage();
    }

    /**
     * Get second attack damage.
     * @return second attack damage.
     */
    public final int getSecondAttackDamage() {
        return secondAttack.getAttackDamage();
    }

    /**
     * Get defense multiplier.
     * @param  opponentType the type of the opponent.
     * @return defense multiplier.
     */
    public final double getDefenseMultiplier(final PokemonType opponentType) {
        return defenseMultiplier * type.getDefenseAccordingToType(opponentType);
    }

    /**
     * Set new defense multiplier.
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
