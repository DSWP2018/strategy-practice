package com.iteso.nintendo.attacks;

public class AttackResult{
    boolean criticalFail;
    boolean criticalHit;
    int damageGiven;
    String attackName;
    /**
     * @return the criticalFail
     */
    public boolean isCriticalFail() {
        return criticalFail;
    }
    /**
     * @return the criticalHit
     */
    public boolean isCriticalHit() {
        return criticalHit;
    }
    /**
     * @param attackName the attackName to set
     */
    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }
    /**
     * @param damageGiven the damageGiven to set
     */
    public void setDamageGiven(int damageGiven) {
        this.damageGiven = damageGiven;
    }
    /**
     * @return the attackName
     */
    public String getAttackName() {
        return attackName;
    }
    /**
     * @return the damageGiven
     */
    public int getDamageGiven() {
        return damageGiven;
    }

}