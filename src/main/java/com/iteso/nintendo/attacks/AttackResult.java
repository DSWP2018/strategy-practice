package com.iteso.nintendo.attacks;

/** */
public class AttackResult {
    /** */
    private boolean criticalFail;
    /** */
    private boolean criticalHit;
    /** */
    private int damageGiven;
    /** */
    private String attackName;

    /**
     * @return the criticalFail
     */
    public final boolean isCriticalFail() {
        return criticalFail;
    }

    /**
     * @return the criticalHit
     */
    public final boolean isCriticalHit() {
        return criticalHit;
    }

    /**
     * @param an the attackName to set
     */
    public final void setAttackName(final String an) {
        this.attackName = an;
    }

    /**
     * @param dg the damageGiven to set
     */
    public final void setDamageGiven(final int dg) {
        this.damageGiven = dg;
    }

    /**
     * @return the attackName
     */
    public final String getAttackName() {
        return attackName;
    }

    /**
     * @return the damageGiven
     */
    public final int getDamageGiven() {
        return damageGiven;
    }

}
