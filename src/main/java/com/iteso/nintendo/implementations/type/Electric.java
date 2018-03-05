package com.iteso.nintendo.implementations.type;

import com.iteso.nintendo.Type;

/**
 * Water type.
 */
public class Electric implements Type {
    /**
     * VS fire.
     */
    private final int attackVsFire = 2;
    /**
     * VS Electric.
     */
    private final int attackVsElectric = 0;
    /**
     * VS Normal.
     */
    private final int attackVsNormal = 5;
    /**
     * VS Plant.
     */
    private final int attackVsPlant = 2;
    /**
     * VS Water.
     */
    private final int attackVsWater = -1;

    /**
     * VS Fire.
     */
    private final double defenceVsFire = 0.3;
    /**
     * VS Electric.
     */
    private final double defenceVsElectric = 0;
    /**
     * VS Normal.
     */
    private final double defenceVsNormal = -0.1;
    /**
     * VS Plant.
     */
    private final double defenceVsPlant = 0.2;
    /**
     * VS Water.
     */
    private final double defenceVsWater = 0.2;
    /**
     * Opponent type.
     */
    private Type opponentType;

    /**
     * Sets opponent type.
     * @param type opponent type
     */
    public final void setOpponentType(final Type type) {
        opponentType = type;
    }

    /**
     * Returns an increase or decrease in damage depending on
     * which type is your opponent.
     * @return Increase or decrease in damage
     */
    @Override
    public final int attackDamageAffectedByType() {
        int attack;
        if (opponentType.getTypeName().equals("Fire")) {
            attack = attackVsFire;
        } else if (opponentType.getTypeName().equals("Electric")) {
            attack = attackVsElectric;
        } else if (opponentType.getTypeName().equals("Normal")) {
            attack = attackVsNormal;
        } else if (opponentType.getTypeName().equals("Plant")) {
            attack = attackVsPlant;
        } else if (opponentType.getTypeName().equals("Water")) {
            attack = attackVsWater;
        } else {
            attack = 0;
        }

        return attack;
    }

    /**
     * Returns an increase or decrease in defence depending on
     * which type is your opponent.
     * @return Increase or decrease in defence
     */
    @Override
    public final double defenseAffectedByType() {
        final double defence;
        if (opponentType.getTypeName().equals("Fire")) {
            defence = defenceVsFire;
        } else if (opponentType.getTypeName().equals("Electric")) {
            defence = defenceVsElectric;
        } else if (opponentType.getTypeName().equals("Normal")) {
            defence = defenceVsNormal;
        } else if (opponentType.getTypeName().equals("Plant")) {
            defence = defenceVsPlant;
        } else if (opponentType.getTypeName().equals("Water")) {
            defence = defenceVsWater;
        } else {
            defence = 0;
        }

        return defence;
    }

    /**
     * type name.
     * @return type name
     */
    @Override
    public final String getTypeName() {
        return "Electric";
    }
}
