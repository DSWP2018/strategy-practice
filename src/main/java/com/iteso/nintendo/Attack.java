package com.iteso.nintendo;

public interface Attack {
    String attack();
    String defend(int damage);
    void setMainAttack(String mainAttack);
    void setSecondAttack(String secondAttack);
    void setHitPoints(int hitPoints);
    void setDefenseMultiplier(int defenseMultiplier);
    void setMainAttackDamage(int damage);
    void setSecondAttackDamage(int damage2);
}
