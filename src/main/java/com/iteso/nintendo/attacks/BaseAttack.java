package com.iteso.nintendo.attacks;

/** */
public abstract class BaseAttack implements Attack {
    /** */
    private int attackDamage;
    /** */
    private String attackName;
    /** */
    private double criticalFailProbablity;
    /** */
    private double criticalHitProbability;

    /**
     * @param cfp the criticalFailProbablity to set
     */
    public final void setCriticalFailProbablity(final double cfp) {
        this.criticalFailProbablity = cfp;
    }

    /**
     * @param chp the criticalHitProbability to set
     */
    public final void setCriticalHitProbability(final double chp) {
        this.criticalHitProbability = chp;
    }

    /**
     * @return the criticalFailProbablity
     */
    public final double getCriticalFailProbablity() {
        return criticalFailProbablity;
    }

    /**
     * @return the criticalHitProbability
     */
    public final double getCriticalHitProbability() {
        return criticalHitProbability;
    }

    /**
     * @param ad the attackDamage to set
     */
    public final void setAttackDamage(final int ad) {
        this.attackDamage = ad;
    }

    /**
     * @param an the attackName to set
     */
    public final void setAttackName(final String an) {
        this.attackName = an;
    }

    /**
     * @return the attackDamage
     */
    public final int getAttackDamage() {
        return attackDamage;
    }

    /**
     * @return the attackName
     */
    public final String getAttackName() {
        return attackName;
    }

}
