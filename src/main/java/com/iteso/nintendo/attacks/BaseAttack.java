package com.iteso.nintendo.attacks;

public abstract class BaseAttack implements Attack{
    int attackDamage;
    String attackName;

    double criticalFailProbablity;
    double criticalHitProbability;

    /**
     * @param criticalFailProbablity the criticalFailProbablity to set
     */
    public void setCriticalFailProbablity(double criticalFailProbablity) {
        this.criticalFailProbablity = criticalFailProbablity;
    }
    /**
     * @param criticalHitProbability the criticalHitProbability to set
     */
    public void setCriticalHitProbability(double criticalHitProbability) {
        this.criticalHitProbability = criticalHitProbability;
    }
    /**
     * @return the criticalFailProbablity
     */
    public double getCriticalFailProbablity() {
        return criticalFailProbablity;
    }
    /**
     * @return the criticalHitProbability
     */
    public double getCriticalHitProbability() {
        return criticalHitProbability;
    }
    

    /**
     * @param attackDamage the attackDamage to set
     */
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    /**
     * @param attackName the attackName to set
     */
    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    /**
     * @return the attackDamage
     */
    public int getAttackDamage() {
        return attackDamage;
    }
    /**
     * @return the attackName
     */
    public String getAttackName() {
        return attackName;
    }

}